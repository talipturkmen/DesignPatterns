/**
 * 
 */
package com.amadeus.training.patterns.creational.factory_method;

import com.amadeus.training.patterns.creational.factory_method.models.Criteria;
import com.amadeus.training.patterns.creational.factory_method.models.Membership;
import com.amadeus.training.patterns.creational.factory_method.models.RegularIndividual;
import com.amadeus.training.patterns.creational.factory_method.models.Young;

/**
 * @author durrah
 *
 */
public class IndividualService extends RegisterService {

	@Override
	Membership createMembership(Criteria criteria) {
		return criteria.age > 20 && criteria.age < 30 ? new Young() : new RegularIndividual();
	}

}
