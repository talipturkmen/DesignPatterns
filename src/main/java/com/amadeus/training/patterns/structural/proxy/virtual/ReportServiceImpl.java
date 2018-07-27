/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.proxy.virtual;

import java.util.Date;

/**
 * @author mohamd.dorra
 *
 */
public class ReportServiceImpl implements ReportingService {
	ReportingConfigurator reportingConfigurator;

	ReportServiceImpl() {
		reportingConfigurator.loadConfigurations();
	}

	@Override
	public Report prepareReports(Date date) {
		return new Report();
	}

}
