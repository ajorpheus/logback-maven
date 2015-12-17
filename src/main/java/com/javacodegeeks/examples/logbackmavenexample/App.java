package com.javacodegeeks.examples.logbackmavenexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javacodegeeks.examples.logbackmavenexample.beans.Message;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		Message message = new Message();
		
		logger.debug("Starting debugging");
		
		message.sayHello();
		
		logger.debug("Ending debugging");
	}
}
