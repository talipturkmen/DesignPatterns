/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

/**
 * @author mohamd.dorra
 *
 */
public class UserExistsMiddleware extends AbstractMiddleware {

	@Override
	public void process(Credential cred, Request request) {
		if (!cred.username.contains("admin")) {
			throw new Error("user not found");
		}
	}

}
