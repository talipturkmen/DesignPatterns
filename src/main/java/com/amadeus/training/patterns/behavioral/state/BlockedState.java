package com.amadeus.training.patterns.behavioral.state;

public class BlockedState extends AccountStateAdapter {

	public BlockedState(Account account) {
		super(account);
	}

	
	@Override
	public void sendMail(String anyMail) {
		throw new UserBlockedException();
	}
	
}
