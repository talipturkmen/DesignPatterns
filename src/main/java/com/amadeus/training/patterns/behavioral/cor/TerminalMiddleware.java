/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

/**
 * @author mohamd.dorra
 *
 */
public class TerminalMiddleware extends AbstractMiddleware {

	@Override
	void process(Credential cred, Request request) {
		System.out.println("We come to an end");
	}

}
