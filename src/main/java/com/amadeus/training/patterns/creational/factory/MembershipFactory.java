/**
 * 
 */
package com.amadeus.training.patterns.creational.factory;

import com.amadeus.training.patterns.creational.factory.models.Individual;
import com.amadeus.training.patterns.creational.factory.models.Charity;
import com.amadeus.training.patterns.creational.factory.models.Membership;
import com.amadeus.training.patterns.creational.factory.models.Organization;

/**
 * @author durrah
 *
 */
public class MembershipFactory {
	private static MembershipFactory instance = new MembershipFactory();

	public static MembershipFactory instance() {
		return instance;
	}

	public Membership createMembership(String type) {
		switch (type) {
		case "individual":
			return new Individual();
		case "organization":
			return new Organization();
		case "charity":
			return new Charity();

		default:
			return null;
		}
	}
}
