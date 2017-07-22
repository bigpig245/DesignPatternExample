package com.ex.pattern.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ProductFactorySingleton {

	private static ProductFactorySingleton instance;

	private ProductFactorySingleton() {

	}

	public static ProductFactorySingleton getInstance() {
		if (instance == null) {
			synchronized (ProductFactorySingleton.class) {
				if (instance == null) {
					instance = new ProductFactorySingleton();
				}
			}
		}
		return instance;
	}

	private Map<ProductType, Class<Product>> registeredProducts = new HashMap<>();

	public void registerProduct(ProductType productType, Class productClass) {
		registeredProducts.put(productType, productClass);
	}

	public Product createProduct(ProductType productType) throws Exception {
		Class productClass = registeredProducts.get(productType);
		if (productClass == null) {
			throw new Exception("This product is not setup!");
		}
		Constructor<Product> constructor = productClass.getDeclaredConstructor(new Class[] {});
		return (Product) constructor.newInstance(new Object[] {});
	}
}
