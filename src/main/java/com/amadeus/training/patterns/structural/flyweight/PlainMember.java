/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.flyweight;

/**
 * @author mohamd.dorra
 *
 */
public class PlainMember {
	String id;
	String tierType;

	/**
	 * @param id
	 * @param tierType
	 */
	public PlainMember(String id, String tierType) {
		super();
		this.id = id;
		this.tierType = tierType;
	}

}
