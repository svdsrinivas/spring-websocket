package com.mia.wskafka.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mia.wskafka.kafka.KafkaProducer;

@Controller
@RequestMapping("/spring-websocket")
public class HelloWorldController {

	@Autowired
	KafkaProducer producer;
	
	@MessageMapping("/portfolio")
	@SendTo("/topic")
	public void sayHello(HelloMessage message) throws Exception{
		producer.send(message);
    }

}