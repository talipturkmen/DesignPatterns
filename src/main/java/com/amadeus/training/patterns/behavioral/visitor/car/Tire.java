/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.visitor.car;

/**
 * @author mohamd.dorra
 *
 */
public class Tire {
	public final String side;

	/**
	 * @param side
	 */
	public Tire(String side) {
		super();
		this.side = side;
	}

	void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
