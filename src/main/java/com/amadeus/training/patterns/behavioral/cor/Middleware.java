/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

/**
 * @author mohamd.dorra
 *
 */
public interface Middleware {
	void check(Credential cred, Request request);
}
