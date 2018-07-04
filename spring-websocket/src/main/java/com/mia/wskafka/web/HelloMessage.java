package com.mia.wskafka.web;

import java.io.Serializable;

public class HelloMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String uid;

    public HelloMessage() {
    }

    public HelloMessage(String name,String uid) {
        this.name = name;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
    
}
