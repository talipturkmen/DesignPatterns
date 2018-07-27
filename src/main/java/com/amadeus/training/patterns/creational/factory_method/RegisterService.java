/**
 * 
 */
package com.amadeus.training.patterns.creational.factory_method;

import com.amadeus.training.patterns.creational.factory_method.models.Criteria;
import com.amadeus.training.patterns.creational.factory_method.models.Membership;

/**
 * @author durrah
 *
 */
public abstract class RegisterService {
	MembershipPersistence persistence = new MembershipPersistence();

	Membership doRegister(Criteria criteria) {
		Membership member = createMembership(criteria);
		return persistence.persiste(member);
	}

	abstract Membership createMembership(Criteria criteria);
}
