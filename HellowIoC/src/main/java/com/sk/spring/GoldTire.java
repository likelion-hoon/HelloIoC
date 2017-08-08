package com.sk.spring;

public class GoldTire extends Tire{
	
	public GoldTire(String tag) {
		super(tag);
	}
	
	public void drive() {
		System.out.println("gold tire : " + tag);
	}

}
