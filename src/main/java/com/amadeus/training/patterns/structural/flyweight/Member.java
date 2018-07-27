/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.flyweight;

/**
 * @author mohamd.dorra
 *
 */
public class Member {
	String id;
	Tier tier;

	/**
	 * @param id
	 * @param tier
	 */
	public Member(String id, Tier tier) {
		super();
		this.id = id;
		this.tier = tier;
	}

}
