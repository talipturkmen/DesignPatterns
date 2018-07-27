/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.template_method.algo;

/**
 * @author mohamd.dorra
 *
 */
public class Item {
	public final String value;

	/**
	 * @param value
	 */
	public Item(String value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
