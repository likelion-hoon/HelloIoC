package com.sk.spring;

public class Truck extends Car{
	
	Tire left;
	Tire right;  //의존성

	public Truck(String model, String color) {
		super(model, color);
		
		left = new Tire("left");
		right = new Tire("right");
		
		
	}
	public Truck(String model, String color,
			Tire left, Tire right) {
		super(model, color);
		this.left = left;
		this.right = right;
		
		
	}
	
	public void run() {
		super.run();
		left.drive();
		right.drive();
	}
	//혹은 이렇게
	public void setTire(Tire left, Tire right) {
		this.left = left;                   
		this.right = right;
	}
	
	/*public void setTire(Tire tire) {
		left tire;
	}*/
	

}
