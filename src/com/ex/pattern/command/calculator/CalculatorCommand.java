package com.ex.pattern.command.calculator;

import com.ex.pattern.command.Command;

/**
 * Concrete Command
 * 
 * @author trangnt
 *
 */
public class CalculatorCommand implements Command {

	private char operator;
	private int operand;
	private Calculator calculator;

	public CalculatorCommand(char operator, int operand, Calculator calculator) {
		super();
		this.operator = operator;
		this.operand = operand;
		this.calculator = calculator;
	}

	public CalculatorCommand() {
		super();
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		calculator.operation(operator, operand);

	}

	@Override
	public void unExecute() {
		calculator.operation(undo(operator), operand);

	}

	// Private helper function
	private char undo(char operator) {
		char undo;
		switch (operator) {
		case '+':
			undo = '-';
			break;
		case '-':
			undo = '+';
			break;
		case '*':
			undo = '/';
			break;
		case '/':
			undo = '*';
			break;
		default:
			undo = ' ';
			break;
		}
		return undo;
	}

}
