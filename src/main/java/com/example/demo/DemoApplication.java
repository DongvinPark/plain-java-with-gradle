package com.example.demo;

import com.example.demo.test_package.Greeter;

public class DemoApplication {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}

}
