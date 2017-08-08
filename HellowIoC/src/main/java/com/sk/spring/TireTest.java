package com.sk.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TireTest {

	public static void main(String[] args) {
		
		
		Truck t = new Truck("truck1", "red");
		t.run();
		
		t.setTire( new GoldTire("gold1"),
				new GoldTire("gold2"));
		
		t.run();
		
		t = new Truck("truck1", "red",
				new GoldTire("gold3"),
				new Tire("tire1")
				);
		t.run();
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext
				("di.xml");
		Truck tr = (Truck)ctx.getBean("truck");
		tr.run();
		
		
		

	}

}



	class a{
		int i;
		int j;
	}
