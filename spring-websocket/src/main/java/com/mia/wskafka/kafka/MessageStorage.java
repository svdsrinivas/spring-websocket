package com.mia.wskafka.kafka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mia.wskafka.web.HelloMessage;

@Component
public class MessageStorage {
	
	private List<HelloMessage> storage = new ArrayList<>();
	
	public void put(HelloMessage msg){
		storage.add(msg);
	}
	
	public void clear(){
		storage.clear();
	}
}
