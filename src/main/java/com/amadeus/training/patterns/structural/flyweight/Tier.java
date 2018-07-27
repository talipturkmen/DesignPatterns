/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.flyweight;

/**
 * @author mohamd.dorra
 *
 */
public class Tier {
	String id;
	TierType type;

	public enum TierType {
		NONE, BLUE, SILVER, GOLD;
		public static TierType fromString(String string) {
			try {
				return valueOf(string.toUpperCase());
			} catch (IllegalArgumentException e) {
				return NONE;
			}

		}
	}

	/**
	 * @param type
	 */
	public Tier(TierType type) {
		super();
		this.type = type;
	}

	/**
	 * Sets the {@link Tier#id} property.
	 *
	 * @param id the {@link Tier#id} instance representing object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Sets the {@link Tier#type} property.
	 *
	 * @param type the {@link Tier#type} instance representing object.
	 */
	public void setType(TierType type) {
		this.type = type;
	}

}
