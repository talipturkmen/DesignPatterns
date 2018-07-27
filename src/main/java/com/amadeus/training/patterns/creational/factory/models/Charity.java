package com.amadeus.training.patterns.creational.factory.models;

public class Charity implements Membership {

	@Override
	public void operation() {
		System.out.println("Charity Membership");
	}

	@Override
	public Membership createMembership() {
		return null;
	}

}
