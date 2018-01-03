package com.ex.pattern.command.remote;

import com.ex.pattern.command.Command;

/**
 * Concrete Command
 * 
 * @author trangnt
 *
 */
public class OnCommand implements Command {

	private Switchable switchable;

	public OnCommand(Switchable swicthable) {
		super();
		this.switchable = swicthable;
	}

	@Override
	public void execute() {
		switchable.on();

	}

	@Override
	public void unExecute() {
		switchable.off();

	}

}
