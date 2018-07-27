
package com.amadeus.training.patterns.behavioral.interpreter;

import com.amadeus.training.patterns.behavioral.interpreter.Context.Direction;

public class VoidExpr extends Expr {

	public VoidExpr(String expression) {
		super(expression);
	}

	@Override
	void evaluate(Context context) {
		context.setDirection(Direction.NONE);
		context.setSteps(0);
	}

}
