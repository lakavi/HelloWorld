package com.company.restfulwebservice.model;

public class Hello {

	private String greet;

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	@Override
	public String toString() {
		return "Hello [greet=" + greet + "]";
	}

	public Hello(String greet) {
		super();
		this.greet = greet;
	}
	
	
	
	
}
