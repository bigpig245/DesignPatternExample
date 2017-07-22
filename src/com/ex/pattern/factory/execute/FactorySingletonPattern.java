package com.ex.pattern.factory.execute;

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
		ProductFactorySingleton factory = ProductFactorySingleton.getInstance();
		Product product = factory.createProduct(ProductType.ONE);
		product.doSomething();
		product.printSource();

		product = factory.createProduct(ProductType.TWO);
		product.doSomething();
		product.printSource();
	}

}
