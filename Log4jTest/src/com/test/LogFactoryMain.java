package com.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogFactoryMain {
	private static Log logger = LogFactory.getLog(LogFactoryMain.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("debug.......");
		logger.info("info.........");
		logger.warn("warn.........");
		logger.error("error.......");
	}
}
