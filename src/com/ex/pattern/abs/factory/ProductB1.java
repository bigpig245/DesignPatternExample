package com.ex.pattern.abs.factory;

public class ProductB1 extends AbsProductB {
	public ProductB1(String arg) {
		System.out.println("Hello " + arg);
	}

	@Override
	public void operationB1() {
		System.out.println("This is an operation 1 of Product B1");
	}

	@Override
	public void operationB2() {
		System.out.println("This is an operation 2 of Product B1");
	}
}
