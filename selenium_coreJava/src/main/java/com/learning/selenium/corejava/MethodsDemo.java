package com.learning.selenium.corejava;

public class MethodsDemo {

	public static void main(String[] args) {
	
		//Why Method -> to reuse all the time
		// Method should be declared out of the main block
		MethodsDemo demo = new MethodsDemo();
		String name = demo.getData();
		System.out.println(name);
		MethodsDemo2 d2 = new MethodsDemo2();
		String name2 = d2.getUserData();
		System.out.println(name2);
		getData2();

	}
	
	public String getData() {
		System.out.println("Hello World");
		return "Rahul Shetty";
		
	}

	public static String getData2() {
		System.out.println("Hello World");
		return "Rahul Shetty";
		
	}

}
