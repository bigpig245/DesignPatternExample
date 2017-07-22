package com.ex.pattern.factory;

public class SecondProduct extends Product {

	static {
		ProductFactorySingleton.getInstance().registerProduct(ProductType.TWO, SecondProduct.class);
	}

	@Override
	public void doSomething() {
		System.out.println("This is second product: Conan");
	}

}
