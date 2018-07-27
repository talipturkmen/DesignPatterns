/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.visitor.car;

/**
 * @author mohamd.dorra
 *
 */
public interface Visitor {
	void visit(Car car);

	void visit(Engine car);

	void visit(Tire car);

	void visit(Valve car);

	void stats();
}
