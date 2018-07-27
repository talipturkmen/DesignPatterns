/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

/**
 * @author mohamd.dorra
 *
 */
public class CsrfMiddleware extends AbstractMiddleware {

	@Override
	void process(Credential cred, Request request) {
		if (!request.body.contains("csrf"))
			throw new Error("no csrf");
	}

}
