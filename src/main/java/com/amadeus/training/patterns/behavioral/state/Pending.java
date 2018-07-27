/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.state;

/**
 * @author mohamd.dorra
 *
 */
public class Pending extends AccountStateAdapter {

	/**
	 * @param account
	 */
	public Pending(Account account) {
		super(account);
	}

	@Override
	public void activate() {
		account.setState(new ActiveState(account));
	}

}
