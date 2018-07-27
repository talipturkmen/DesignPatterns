package com.amadeus.training.patterns.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amadeus.training.patterns.behavioral.interpreter.Context.Direction;

public class Move extends Expr {

	public static final Pattern pattern = Pattern.compile("(?i)move(\\s+)*([0-9]*)\\s*;*");

	public Move(String expression) {
		super(expression);
	}

	@Override
	void evaluate(Context context) {
		Matcher matcher = pattern.matcher(expression);
		if (matcher.matches()) {
			String group = matcher.group(2);
			if (group.trim().isEmpty()) {
				context.setSteps(1);
			} else {
				context.setSteps(Integer.parseInt(group));
			}
			context.setDirection(Direction.HEAD);
		}
	}

	public static void main(String[] args) {
		Move e = new Move("move;");
		Context c = new Context();
		e.evaluate(c);
		System.out.println(c.getDirection());
		System.out.println(c.getSteps());
	}

}
