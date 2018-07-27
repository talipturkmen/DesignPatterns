package com.amadeus.training.patterns.behavioral.mediator.after;

public class Member {
	public String id;
	public int balance;
	public Tier tier;

	public enum Tier {
		BLUE, SILVER, GOLD
	}

	public Member() {
		super();
	}

	public Member(String id, int balance, Tier tier) {
		super();
		this.id = id;
		this.balance = balance;
		this.tier = tier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Tier getTier() {
		return tier;
	}

	public void setTier(Tier tier) {
		this.tier = tier;
	}

}
