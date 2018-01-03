package com.ex.pattern.command.calculator;

/**
 * Client
 * 
 * @author trangnt
 *
 */
public class TestCommandPattern {
	public static void main(String[] args) {
		// Create user and let her compute
		User user = new User();

		user.compute('+', 100);
		user.compute('-', 50);
		user.compute('*', 10);
		user.compute('/', 2);

		// Undo 4 commands
		user.undo(4);

		// Redo 3 commands
		user.redo(3);

	}

}
