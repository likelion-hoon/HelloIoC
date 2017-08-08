package com.sk.spring;

public class Car {
		String model;
		String color;
		
		
		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		public Car(String model, String color) {
			this.model = model;
			this.color = color;
		}
		
		public void run() {
			System.out.println("run~~" +  model + "/" + color);
		}
		
		public void init() {
			System.out.println("init~~");
		}
		
		public void close() {
			System.out.println("close");
		}
		
}
