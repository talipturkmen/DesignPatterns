/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

import java.util.Objects;

/**
 * @author mohamd.dorra
 *
 */
public class MiddlewareChain {

	public static Middleware of(AbstractMiddleware... middlewares) {
		Objects.requireNonNull(middlewares);

		for (int i = 0; i < middlewares.length - 1; i++) {
			middlewares[i].setSuccessor(middlewares[i + 1]);
		}
		return middlewares[0];
	}

}
