package com.jsp.costructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private int id;
	private String name;
	private String brand;
	
	
	public Car(@Value(value = "123") int id ,@Value(value = "abc") String name, @Value(value = "xyz")String brand ){
			this.id=id;
			this.name=name;
			this.brand=brand;
	}
	public void printEmpDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(brand);
	}
}	
