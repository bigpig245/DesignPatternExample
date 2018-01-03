package com.ex.pattern.command.remote;

import com.ex.pattern.command.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No Command was set");

	}

	@Override
	public void unExecute() {
		System.out.println("No Command was set");
	}

}
