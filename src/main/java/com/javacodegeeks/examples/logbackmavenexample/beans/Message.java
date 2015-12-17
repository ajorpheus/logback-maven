package com.javacodegeeks.examples.logbackmavenexample.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Message {
	private static final Logger logger = LoggerFactory.getLogger(Message.class);
	
	public String sayHello() {
		String msg = "Hello World!";
		
		logger.info("The message is: {}", msg);
		logger.debug("Debugging...");
		
		return msg;
	}
}
