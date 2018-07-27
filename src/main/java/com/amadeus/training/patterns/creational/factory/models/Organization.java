package com.amadeus.training.patterns.creational.factory.models;

public class Organization implements Membership {

	@Override
	public void operation() {
		System.out.println("Organization Membership");
	}

	@Override
	public Membership createMembership() {
		return null;
	}

}
