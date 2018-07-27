package com.amadeus.training.patterns.creational.factory;

import com.amadeus.training.patterns.creational.factory.models.Charity;
import com.amadeus.training.patterns.creational.factory.models.Membership;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DynamicMembershipFactory {

	private final Map<String, Membership> registeredMemberships = new HashMap<>();
	private static DynamicMembershipFactory instance = new DynamicMembershipFactory();

	public static DynamicMembershipFactory instance() {
		return instance;
	}

	public void registerMembership(String type, Class<Charity> supplier) {
		//registeredMemberships.put(type, supplier);
	}

	public Membership createMembership(String type) {
		return registeredMemberships.get(type).createMembership();

	}
}
