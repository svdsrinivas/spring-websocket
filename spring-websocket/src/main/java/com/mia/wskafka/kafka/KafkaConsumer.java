package com.mia.wskafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.mia.wskafka.web.HelloMessage;

public class KafkaConsumer {
	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

	@Autowired
	MessageStorage storage;
	
	 @Autowired
	 private SimpMessagingTemplate template;
	
	@KafkaListener(topics="topic")
    public void processMessage(HelloMessage content) {
		log.info("received content = '{}'", content);
		storage.put(content);
		this.template.convertAndSend("/topic", content);
    }
}
