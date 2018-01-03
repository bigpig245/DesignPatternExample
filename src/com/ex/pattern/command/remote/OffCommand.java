package com.ex.pattern.command.remote;

import com.ex.pattern.command.Command;

public class OffCommand implements Command {

	Switchable switchable;

	public OffCommand(Switchable switchable) {
		super();
		this.switchable = switchable;
	}

	@Override
	public void execute() {
		switchable.off();

	}

	@Override
	public void unExecute() {
		switchable.on();

	}

	public Switchable getSwitchable() {
		return switchable;
	}

	public void setSwitchable(Switchable switchable) {
		this.switchable = switchable;
	}

}
