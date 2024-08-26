package com.sunlife;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLog4j {
	private static Logger logger=LoggerFactory.getLogger(HelloLog4j.class);
	public static void main(String[] args) {
		logger.info("hello to logging");
		System.out.println("hello without logging");
		try {
			String data="77u";
			Integer val=Integer.parseInt(data);
		}catch(Exception e) {
			
			logger.error(e.getMessage());
		}
	}

}
