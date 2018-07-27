/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.observer;

/**
 * @author mohamd.dorra
 *
 */
public class User {
	public final String name;
	public final Gender gender;

	enum Gender {
		MALE, FEMALE, PRIVATE
	}

	/**
	 * @param name
	 * @param gender
	 */
	public User(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

}
