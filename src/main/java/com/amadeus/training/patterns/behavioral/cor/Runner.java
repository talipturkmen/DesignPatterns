/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.cor;

/**
 * @author mohamd.dorra
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractMiddleware user = new UserExistsMiddleware();
		AbstractMiddleware auth = new AuthorizedMiddleware();
		AbstractMiddleware req = new RequestCheckMiddleware();
		AbstractMiddleware csrf = new CsrfMiddleware();
		AbstractMiddleware terminal = new TerminalMiddleware();
		user.setSuccessor(auth);
		auth.setSuccessor(req);
		req.setSuccessor(csrf);

		MiddlewareChain.of(user, auth, req, csrf, terminal).check(new Credential("admin", ""),
				new Request("WHERE 1csrf"));
	}

}
