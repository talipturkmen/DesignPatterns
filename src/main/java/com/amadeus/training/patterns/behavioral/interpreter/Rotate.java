package com.amadeus.training.patterns.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amadeus.training.patterns.behavioral.interpreter.Context.Direction;

public class Rotate extends Expr {
	public final static Pattern pattern = Pattern.compile("(?i)(right|left)\\s*[;]*");

	public Rotate(String expression) {
		super(expression);
	}

	@Override
	void evaluate(Context context) {
		Matcher matcher = pattern.matcher(expression);
		if (matcher.matches()) {
			String rotate = matcher.group(1);
			Context.Direction cDirection = Direction.ofString(rotate);
			context.setDirection(cDirection);
			context.setSteps(0);
		}
	}

	public static void main(String[] args) {
		Rotate e = new Rotate("Right;");
		Context c = new Context();
		e.evaluate(c);
		System.out.println(c.getDirection());
	}

}
