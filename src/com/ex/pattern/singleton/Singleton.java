package com.ex.pattern.singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.print("Initialize Singleton");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					System.out.println("First time getInstance invoked!");
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void doSomething() {
		System.out.println("Singleton do something");
	}

	public void printSource() {
		System.out.println("http://www.oodesign.com/singleton-pattern.html");
	}

}
