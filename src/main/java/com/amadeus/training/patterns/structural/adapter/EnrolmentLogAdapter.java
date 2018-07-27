/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.adapter;

import com.amadeus.legacy.LegacyEnrolmentLogger;
import com.amadeus.training.patterns.structural.adapter.models.Member;

/**
 * @author mohamd.dorra
 *
 */
public class EnrolmentLogAdapter implements EnrolmentLogger {
	private LegacyEnrolmentLogger adaptee;

	/**
	 * @param adaptee
	 */
	public EnrolmentLogAdapter(LegacyEnrolmentLogger adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public void logEnrolment(Member member) {
		adaptee.logEnrolment(member.firstName, member.lastName, member.birthdate, member.email);
	}

}
