package com.ex.pattern.abs.factory;

public class ConcreteFactory1 extends AbsFactory {
	public AbsProductA createProductA() {
		return new ProductA1("Product A1");
	}

	public AbsProductB createProductB(){
		return new ProductB1("Product B1");
	}

}
