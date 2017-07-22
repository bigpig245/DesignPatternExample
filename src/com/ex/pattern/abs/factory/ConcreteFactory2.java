package com.ex.pattern.abs.factory;

public class ConcreteFactory2 extends AbsFactory {
	public AbsProductA createProductA() {
		return new ProductA2("Product A2");
	}

	public AbsProductB createProductB(){
		return new ProductB2("Product B2");
	}

}
