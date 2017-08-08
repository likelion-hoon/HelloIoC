package com.sk.spring;

public class Tire {
	String tag = "";
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Tire(String tag) {
		this.tag = tag;
	}
	
	public void drive() {
		System.out.println("Tire =" + tag);
	}
}
