package com.sk.spring;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

public class CarService {
	
	@Resource(name="car2")
    Car car = null; 
	
	public CarService() {
		
	}
	
	@Autowired // 객체 생성을 할때 car객체를 자동으로 넣어준다. 
	public CarService(Car car) {
		car.color = "------------"; 
		car.run(); 
	}
	
	public void execute() {
		car.setColor("------------");
		car.run(); 
	}
	
	
}
