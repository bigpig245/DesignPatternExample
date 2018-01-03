package com.ex.pattern.command.remote;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		addCommand(remote, "Living Room", 0);
		addCommand(remote, "Kitchen", 1);
		addCommand(remote, "Bath Room", 2);
		addCommand(remote, "Balcony", 3);
		addCommand(remote, "Lobby", 4);
		addCommand(remote, "Bedroom", 5);
		addCommand(remote, "Main Bedroom", 6);

		for (int i = 0; i < RemoteControl.MAX_SLOT; i++) {
			remote.onButtonWasPress(i);
			remote.offButtonWasPress(i);
		}
	}

	private static void addCommand(RemoteControl remote, String lightName, int index) {
		Light light = new Light(lightName);
		OnCommand lightOn = new OnCommand(light);
		OffCommand lightOff = new OffCommand(light);
		remote.setCommand(index, lightOn, lightOff);
	}

}
