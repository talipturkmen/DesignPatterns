package com.amadeus.training.patterns.behavioral.interpreter;

import java.util.regex.Pattern;

public class RotateThenMove extends Expr {
	public final static Pattern pattern = Pattern.compile("(?i)(.*)\\s+then\\s+(.*)\\s*[;]*");

	private Expr first;
	private Expr second;

	public RotateThenMove(String expression) {
		super(expression);
		first = new VoidExpr(expression);
		second = new VoidExpr(expression);
	}

	@Override
	void evaluate(Context context) { // right then move 10
		String[] parts = expression.split("\\s+then\\s+");
		first = Expr.parse(parts[0]);
		second = Expr.parse(parts[1]);
		if (first instanceof VoidExpr || second instanceof VoidExpr) {
			first = new VoidExpr(expression);
			second = new VoidExpr(expression);
		}
	}

	@Override
	public void interpret(Context context) {
		evaluate(context);
		first.interpret(context);
		second.interpret(context);
	}

}
