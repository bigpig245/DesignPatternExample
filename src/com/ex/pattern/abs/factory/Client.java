package com.ex.pattern.abs.factory;

import com.ex.pattern.abs.factory.AbsFactory;
import com.ex.pattern.abs.factory.AbsProductA;
import com.ex.pattern.abs.factory.AbsProductB;
import com.ex.pattern.abs.factory.FactoryMaker;
import com.ex.pattern.factory.ProductType;

public class Client {

	public static void main(String[] args) throws Exception {
		callFactory(ProductType.ONE);
		callFactory(ProductType.TWO);
	}

	private static void callFactory(ProductType productType) {
		AbsFactory absFactory = FactoryMaker.getFactory(productType);
		AbsProductA productA = absFactory.createProductA();
		productA.operationA1();
		productA.operationA2();
		AbsProductB productB = absFactory.createProductB();
		productB.operationB1();
		productB.operationB2();
	}

}
