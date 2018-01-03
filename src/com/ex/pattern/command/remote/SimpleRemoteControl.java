package com.ex.pattern.command.remote;

import com.ex.pattern.command.Command;

/**
 * Invoker
 * 
 * @author trangnt
 *
 */
public class SimpleRemoteControl {
	private Command command;

	public SimpleRemoteControl() {
		super();
	}

	public SimpleRemoteControl(Command command) {
		super();
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonWasPressed() {
		command.execute();
	}

}
