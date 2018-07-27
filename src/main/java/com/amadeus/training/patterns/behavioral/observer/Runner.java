/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.observer;

import java.util.Observable;

import com.amadeus.training.patterns.behavioral.observer.User.Gender;

/**
 * @author mohamd.dorra
 *
 */
public class Runner {

	public static void main(String[] args) {
		UsersPage page = new UsersPage();

		page.addUser(new User("Emmy", Gender.FEMALE));
		page.addUser(new User("John", Gender.MALE));
		page.addUser(new User("Duke", Gender.PRIVATE));
		page.addUser(new User("Jessica", Gender.FEMALE));
		// page.addUser(new User("Lara", Gender.FEMALE));
	}
}



