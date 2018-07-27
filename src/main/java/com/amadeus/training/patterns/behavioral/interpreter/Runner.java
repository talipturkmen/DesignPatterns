package com.amadeus.training.patterns.behavioral.interpreter;

public class Runner {
	public static void main(String[] args) {
		String program = "";
		program += "move 5;" + System.lineSeparator();
		program += "left then move 2;" + System.lineSeparator();
		program += "move 2;" + System.lineSeparator();
		program += "right;" + System.lineSeparator();

		Context context = new Context();
		for (String line : program.split(System.lineSeparator())) {
			Expr expr = Expr.parse(line);
			expr.interpret(context);
		}
	}
}
