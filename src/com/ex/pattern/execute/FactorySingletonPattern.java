package com.ex.pattern.execute;

import com.ex.pattern.factory.FirstProduct;
import com.ex.pattern.factory.Product;
import com.ex.pattern.factory.ProductFactorySingleton;
import com.ex.pattern.factory.ProductType;
import com.ex.pattern.factory.SecondProduct;

public class FactorySingletonPattern {

	static {
		try {
			Class.forName(FirstProduct.class.getName());
			Class.forName(SecondProduct.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		createProduct(ProductType.ONE);
		createProduct(ProductType.TWO);
		createProduct(ProductType.THREE);
	}

	private static void createProduct(ProductType productType) throws Exception {
		ProductFactorySingleton factory = ProductFactorySingleton.getInstance();
		Product product = factory.createProduct(productType);
		product.doSomething();
		product.printSource();
	}

}
