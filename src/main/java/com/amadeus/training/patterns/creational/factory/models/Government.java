package com.amadeus.training.patterns.creational.factory.models;

public class Government implements Membership {

	@Override
	public void operation() {
		System.out.println("Government Membership");
	}

	@Override
	public Membership createMembership() {
		return null;
	}

}
