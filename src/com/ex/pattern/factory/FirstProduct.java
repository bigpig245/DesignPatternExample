package com.ex.pattern.factory;

public class FirstProduct extends Product {
	static {
		ProductFactorySingleton.getInstance().registerProduct(ProductType.ONE, FirstProduct.class);
	}

	@Override
	public void doSomething() {
		System.out.println("This is first product: One piece");
	}

}
