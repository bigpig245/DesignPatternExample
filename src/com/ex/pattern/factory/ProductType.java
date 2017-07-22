package com.ex.pattern.factory;

public enum ProductType {
	ONE ("One Piece"),
	TWO("Conan"),
	THREE("NARUTO");
	
	private final String name;

	private ProductType (String name) {
		this.name = name;
	}
}
