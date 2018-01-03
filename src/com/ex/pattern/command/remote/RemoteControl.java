package com.ex.pattern.command.remote;

import java.util.ArrayList;
import java.util.List;

import com.ex.pattern.command.Command;

/**
 * Invoker
 * 
 * @author trangnt
 *
 */
public class RemoteControl {
	private List<Command> onCommands = new ArrayList<>();
	private List<Command> offCommands = new ArrayList<>();
	public static final int MAX_SLOT = 7;

	public RemoteControl() {
		super();
		Command noCommand = new NoCommand();
		for (int i = 0; i < MAX_SLOT; i++) {
			onCommands.add(noCommand);
			offCommands.add(noCommand);
		}
	}

	public void setCommand(int slot, OnCommand onCommand, OffCommand offCommand) {
		if (slot > MAX_SLOT) {
			System.out.println("That slot does not exist");
		} else {
			onCommands.add(slot, onCommand);
			offCommands.add(slot, offCommand);
		}
	}

	public void onButtonWasPress(int slot) {
		if (slot > MAX_SLOT) {
			System.out.println("That slot does not exist");
		} else {
			onCommands.get(slot).execute();

		}
	}

	public void offButtonWasPress(int slot) {
		if (slot > MAX_SLOT) {
			System.out.println("That slot does not exist");
		} else {
			offCommands.get(slot).execute();

		}
	}

}
