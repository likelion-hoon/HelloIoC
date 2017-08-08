package com.sk.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car("SM6","red");
		c.run();
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext
				("ioc.xml");
		
		Car c2 = (Car)ctx.getBean("c");
		
		
		Car c3 = (Car)ctx.getBean("c");
		
		
		c2.setColor("teal");
		
		c2.run();
		c3.run();
		
		if (c2 == c3 ) System.out.println("same");
		else System.out.println("not same");
		
		Car s = (Car)ctx.getBean("s");
		s.run();
		Car s2 = (Car)ctx.getBean("s");
		s2.run();
		
		ctx.close();

	}

}
