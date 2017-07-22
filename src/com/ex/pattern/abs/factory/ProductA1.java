package com.ex.pattern.abs.factory;

public class ProductA1 extends AbsProductA {
	public ProductA1(String arg) {
		System.out.println("Hello " + arg);
	}

	public void operationA1() {
		System.out.println("This is an operation 1 of Product A1");

	}

	public void operationA2() {
		System.out.println("This is an operation 2 of Product A1");

	}

}
