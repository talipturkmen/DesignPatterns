/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.visitor.car;

/**
 * @author mohamd.dorra
 *
 */
public class Valve {
	public final String name;

	/**
	 * @param name
	 */
	public Valve(String name) {
		super();
		this.name = name;
	}

	void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
