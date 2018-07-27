/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.proxy.protection;

/**
 * @author mohamd.dorra
 *
 */
public class SearchServiceImpl implements SearchService {

	@Override
	public Result search(String keyword) {
		return new Result();
	}

}
