package com.amadeus.training.patterns.behavioral.interpreter;

import java.util.regex.Matcher;

public abstract class Expr {
	protected String expression;

	public Expr(String expression) {
		super();
		this.expression = expression;
	}

	abstract void evaluate(Context context);

	public static Expr parse(String expression) {
		Matcher matcher = Rotate.pattern.matcher(expression);
		if (matcher.matches())
			return new Rotate(expression);

		matcher = Move.pattern.matcher(expression);
		if (matcher.matches())
			return new Move(expression);

		matcher = RotateThenMove.pattern.matcher(expression);
		if (matcher.matches())
			return new RotateThenMove(expression);

		return new VoidExpr(expression);
	}

	public void interpret(Context context) {
		evaluate(context);
		context.doAction();
	}
}
