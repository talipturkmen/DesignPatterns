/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

/**
 * @author mohamd.dorra
 *
 */
public class RequestCheckMiddleware extends AbstractMiddleware {

	@Override
	public void process(Credential cred, Request request) {
		if (request.body.contains("WHERE 1=1"))
			throw new Error("attack");
	}

}
