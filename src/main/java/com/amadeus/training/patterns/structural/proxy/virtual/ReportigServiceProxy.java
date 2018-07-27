/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.proxy.virtual;

import java.util.Date;

/**
 * @author mohamd.dorra
 *
 */
public class ReportigServiceProxy implements ReportingService {

	ReportServiceImpl wrapee;

	@Override
	public Report prepareReports(Date date) {
		if (wrapee == null)
			wrapee = new ReportServiceImpl();
		return wrapee.prepareReports(date);
	}

}
