/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.visitor.car;

import java.util.Collections;
import java.util.List;

/**
 * @author mohamd.dorra
 *
 */
public class Engine {
	private List<Valve> valves;

	/**
	 * @param valves
	 */
	public Engine(List<Valve> valves) {
		super();
		this.valves = valves;
	}

	/**
	 * Gets the value of valves
	 * 
	 * @return the valves field of {@link Engine#valves}
	 */
	public List<Valve> getValves() {
		return Collections.unmodifiableList(valves);
	}

	void accept(Visitor visitor) {
		valves.forEach(valve -> valve.accept(visitor));
		visitor.visit(this);
	}

}
