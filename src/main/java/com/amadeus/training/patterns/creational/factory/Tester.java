package com.amadeus.training.patterns.creational.factory;

import org.junit.Assert;
import org.junit.Test;

import com.amadeus.training.patterns.creational.factory.models.Charity;
import com.amadeus.training.patterns.creational.factory.models.Membership;

public class Tester {
	@Test
	public void testNotFound() {
		MembershipFactory factory = MembershipFactory.instance();
		Membership membership = factory.createMembership("not_found");
		Assert.assertNull(membership);
	}

	@Test
	public void testSimple() {
		MembershipFactory factory = MembershipFactory.instance();
		Membership membership = factory.createMembership("charity");
		Assert.assertNotNull(membership);
		Assert.assertEquals(Charity.class, membership.getClass());
	}

	@Test
	public void testSynamicRegistration() {
		DynamicMembershipFactory factory = DynamicMembershipFactory.instance();
		Membership membership = factory.createMembership("charity");
		Assert.assertNull(membership);
		factory.registerMembership("charity", Charity.class);
		membership = factory.createMembership("charity");
		Assert.assertEquals(Charity.class, membership.getClass());
	}

}
