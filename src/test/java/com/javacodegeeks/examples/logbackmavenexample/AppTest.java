package com.javacodegeeks.examples.logbackmavenexample;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javacodegeeks.examples.logbackmavenexample.beans.Message;

import static org.junit.Assert.assertTrue;

public class AppTest {
	private static final Logger logger = LoggerFactory.getLogger(AppTest.class);
	private static Message message;

	@BeforeClass
	public static void init() {
		message = new Message();
	}
	
	@Test
	public void testApp() {
		String msg = "";
		
		logger.debug("Debugging Test...");
		
		msg = message.sayHello();
		
		assertTrue("Hello World!".equals(msg));
	}
}
