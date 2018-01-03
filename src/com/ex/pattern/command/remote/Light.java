package com.ex.pattern.command.remote;

/**
 * Receiver
 * 
 * @author trangnt
 *
 */
public class Light implements Switchable {

	private String name;

	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " " + name + " is on");
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " " + name + " is off");
	}

	public String getName() {
		return name;
	}

	public Light(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
