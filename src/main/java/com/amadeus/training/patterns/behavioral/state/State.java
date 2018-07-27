/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.state;

/**
 * @author mohamd.dorra
 *
 */
public interface State {
	void create();

	void activate();

	void deactivate();

	void block();

	void changeName(String name);

	/**
	 * @param anyMail
	 */
	void sendMail(String anyMail);
}
