package com.amadeus.training.patterns.behavioral.state;

public class ActiveState extends AccountStateAdapter {

	/**
	 * @param account
	 */
	public ActiveState(Account account) {
		super(account);
	}

	@Override
	public void changeName(String name) {
		if (name.contains("violent")) {
			account.setState(new BlockedState(account));
			return;
		}
		account.setName(name);
	}
}
