/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

/**
 * @author mohamd.dorra
 *
 */
public abstract class AbstractMiddleware implements Middleware {
	protected AbstractMiddleware successor;

	/**
	 * Sets the {@link AbstractMiddleware#successor} property.
	 *
	 * @param next the {@link AbstractMiddleware#successor} instance representing
	 *             object.
	 */
	public void setSuccessor(AbstractMiddleware next) {
		this.successor = next;
	}

	abstract void process(Credential cred, Request request);

	@Override
	public final void check(Credential cred, Request request) {
		process(cred, request);
		if (successor != null) {
			successor.check(cred, request);
		}
	}

}
