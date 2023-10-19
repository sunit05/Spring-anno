package com.jsp.setter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String name;
	private String mail;
	
	public int getId() {
			return id;
		}

				@Value(value = "102")
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

				@Value(value = "sunit")
		public void setName(String name) {
			this.name = name;
		}

		public String getMail() {
			return mail;
		}

				@Value(value = "mail")
		public void setMail(String mail) {
			this.mail = mail;
		}

	public Person() {
		System.out.println("object created");
	}
	
	public void printEmpDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(mail);
	}
	
}
