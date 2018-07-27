package com.amadeus.training.patterns.creational.factory.models;

public class Individual implements Membership {

	@Override
	public void operation() {
		System.out.println("Individual Membership");
	}

	@Override
	public Membership createMembership() {
		return new Individual();
	}

}
