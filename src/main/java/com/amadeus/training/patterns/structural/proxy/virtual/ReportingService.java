/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.proxy.virtual;

import java.util.Date;

/**
 * @author mohamd.dorra
 *
 */
public interface ReportingService {
	Report prepareReports(Date date);
}
