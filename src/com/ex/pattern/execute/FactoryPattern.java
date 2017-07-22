package com.ex.pattern.execute;

import com.ex.pattern.factory.FirstProduct;
import com.ex.pattern.factory.Product;
import com.ex.pattern.factory.ProductFactory;
import com.ex.pattern.factory.ProductType;
import com.ex.pattern.factory.SecondProduct;

public class FactoryPattern {

	public static void main(String[] args) throws Exception {
		ProductFactory factory = new ProductFactory();
		factory.registerProduct(ProductType.ONE, FirstProduct.class);
		factory.registerProduct(ProductType.TWO, SecondProduct.class);

		createProduct(factory, ProductType.ONE);
		createProduct(factory, ProductType.TWO);
		createProduct(factory, ProductType.THREE);


	}

	private static void createProduct(ProductFactory factory, ProductType productType) throws Exception {
		Product product = factory.createProduct(productType);
		product.doSomething();
		product.printSource();
	}

}
