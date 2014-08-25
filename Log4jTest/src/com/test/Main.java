package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {
	private static Logger logger;

	private static void initLoding() {
		DOMConfigurator.configure("config/log4j.xml");
		logger = Logger.getLogger(Main.class);
		if (logger.isInfoEnabled()) {
			logger.info("ÏµÍ³Æô¶¯......");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initLoding();
		logger.debug("debug.......");
		logger.info("info.........");
		logger.warn("warn.........");
		logger.error("error.......");
	}

}
