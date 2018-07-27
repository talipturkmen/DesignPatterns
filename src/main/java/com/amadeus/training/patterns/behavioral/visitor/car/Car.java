/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.visitor.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mohamd.dorra
 *
 */
public class Car {
	private Engine engine;
	private List<Tire> tires;

	public static Car of(Engine engine, List<Tire> tiers) {
		Car car = new Car();
		car.engine = engine;
		car.tires = new ArrayList<>(tiers);
		return car;
	}

	/**
	 * Gets the value of engine
	 * 
	 * @return the engine field of {@link Car#engine}
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * Gets the value of tires
	 * 
	 * @return the tires field of {@link Car#tires}
	 */
	public List<Tire> getTires() {
		return Collections.unmodifiableList(tires);
	}

	void accept(Visitor visitor) {
		engine.accept(visitor);
		tires.forEach(tire -> tire.accept(visitor));
		visitor.visit(this);
		visitor.stats();
	}

	void printMe(){

	}

}
