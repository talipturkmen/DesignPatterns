/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.state;

import org.junit.Test;

/**
 * @author mohamd.dorra
 *
 */
public class Runner {
	public static void main(String[] args) {
		Account account = new Account();
		account.activate();
		account.setName("violent");
		account.sendMail("address,content");
	}

	@Test(expected = UserBlockedException.class)
	public void blocked() {
		Account account = new Account();
		System.out.println(account.getState());
		account.activate();
		System.out.println(account.getState());
		account.changeName("violent");
		System.out.println(account.getState());
		account.sendMail("address,content");
		System.out.println(account.getState());
	}
}
