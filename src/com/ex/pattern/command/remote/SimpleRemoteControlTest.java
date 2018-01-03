package com.ex.pattern.command.remote;

/**
 * Client
 * 
 * @author trangnt
 *
 */
public class SimpleRemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Living Room");
		OnCommand lightOn = new OnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
}
