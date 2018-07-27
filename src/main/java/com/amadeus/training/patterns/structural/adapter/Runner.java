/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.adapter;

import java.util.Date;

import com.amadeus.legacy.EnrolmentLoggerImpl;
import com.amadeus.legacy.LegacyEnrolmentLogger;
import com.amadeus.training.patterns.structural.adapter.models.Member;

/**
 * @author mohamd.dorra
 *
 */
public class Runner {
	public static void main(String[] args) {
		String firstName = "Albert";
		String lastName = "Einstein";
		Date bd = new Date();
		String email = "user@email.com";
		Member member = new Member(firstName, lastName, bd, email);
		LegacyEnrolmentLogger legacyEnrolmentLogger = new EnrolmentLoggerImpl();
		legacyEnrolmentLogger.logEnrolment(firstName, lastName, bd, email);

		EnrolmentLogger adapter = new EnrolmentLogAdapter(legacyEnrolmentLogger);
		adapter.logEnrolment(member);
	}

}
