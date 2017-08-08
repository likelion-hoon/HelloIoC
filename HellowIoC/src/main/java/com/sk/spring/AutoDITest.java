package com.sk.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AutoDITest {
	
	public static void main(String[] args) {
		
		 GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di.xml");

	     CarService svr = (CarService) ctx.getBean("service");
	     svr.execute();
	}

}
