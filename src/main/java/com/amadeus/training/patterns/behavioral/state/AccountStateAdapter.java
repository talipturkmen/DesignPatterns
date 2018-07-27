package com.amadeus.training.patterns.behavioral.state;

public class AccountStateAdapter implements State {
	protected Account account;

	/**
	 * @param account
	 */
	public AccountStateAdapter(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void create() {

	}

	@Override
	public void activate() {
	}

	@Override
	public void deactivate() {
	}

	@Override
	public void block() {
	}

	@Override
	public void changeName(String name) {
	}

	@Override
	public void sendMail(String anyMail) {
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
