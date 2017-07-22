package com.ex.pattern.factory.execute;

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

		Product product = factory.createProduct(ProductType.ONE);
		product.doSomething();
		product.printSource();

		product = factory.createProduct(ProductType.TWO);
		product.doSomething();
		product.printSource();

		product = factory.createProduct(ProductType.THREE);
		product.doSomething();

	}

}
