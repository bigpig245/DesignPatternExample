package com.ex.pattern.abs.factory;

public class ProductA2 extends AbsProductA {
	public ProductA2(String arg) {
		System.out.println("Hello " + arg);
	}

	public void operationA1() {
		System.out.println("This is an operation 1 of Product A2");

	}

	public void operationA2() {
		System.out.println("This is an operation 2 of Product A2");

	}

}
