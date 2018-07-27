/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.visitor.car;

/**
 * @author mohamd.dorra
 *
 */
public class CountVisitor extends CheckVisitor {
	private int valueCount;
	private int tireCount; // :D

	@Override
	public void visit(Car car) {
		super.visit(car);
	}

	@Override
	public void visit(Engine car) {
		super.visit(car);
	}

	@Override
	public void visit(Tire car) {
		super.visit(car);
		tireCount++;
	}

	@Override
	public void visit(Valve car) {
		super.visit(car);
		valueCount++;
	}

	@Override
	public void stats() {
		System.out.println("Valve count: " + valueCount + ", Tire Count: " + tireCount);
	}

}
