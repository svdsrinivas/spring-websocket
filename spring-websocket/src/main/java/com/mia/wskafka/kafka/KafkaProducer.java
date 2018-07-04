package com.mia.wskafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.mia.wskafka.web.HelloMessage;

public class KafkaProducer {
	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, HelloMessage> kafkaTemplate;
	
	String kafkaTopic = "topic";
	
	public void send(HelloMessage data) {
	    log.info("sending data='{}'", data);
	    kafkaTemplate.send(kafkaTopic, data);
	}
}
