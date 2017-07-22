package com.ex.pattern.abs.factory;

import com.ex.pattern.factory.ProductType;

public class FactoryMaker {
	private static AbsFactory absFactory = null;

	public static AbsFactory getFactory(ProductType productType) {
		switch (productType) {
		case ONE:
			absFactory = new ConcreteFactory1();
			break;
		case TWO:
			absFactory = new ConcreteFactory2();
			break;
		default:
			break;
		}
		return absFactory;

	}

}
