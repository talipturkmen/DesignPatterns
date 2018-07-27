/**
 * 
 */
package com.amadeus.training.patterns.creational.factory_method;

import com.amadeus.training.patterns.creational.factory_method.models.Corporate;
import com.amadeus.training.patterns.creational.factory_method.models.Criteria;
import com.amadeus.training.patterns.creational.factory_method.models.Membership;
import com.amadeus.training.patterns.creational.factory_method.models.RegularOrg;

/**
 * @author durrah
 *
 */
public class OrganizationService extends RegisterService {

	@Override
	Membership createMembership(Criteria criteria) {
		return criteria.memberCount > 1000 ? new Corporate() : new RegularOrg();
	}

}
