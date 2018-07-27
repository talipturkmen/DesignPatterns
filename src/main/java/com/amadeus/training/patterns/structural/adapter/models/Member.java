/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.adapter.models;

import java.util.Date;

/**
 * @author mohamd.dorra
 *
 */
public class Member {
	public final String firstName;
	public final String lastName;
	public final Date birthdate;
	public final String email;

	/**
	 * @param firstName
	 * @param lastName
	 * @param birthdate
	 * @param email
	 */
	public Member(String firstName, String lastName, Date birthdate, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.email = email;
	}

}
