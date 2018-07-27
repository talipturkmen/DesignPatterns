/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.proxy.protection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mohamd.dorra
 *
 */

public class SearchServiceProxy implements SearchService {

	SearchServiceImpl wrapee = new SearchServiceImpl();

	Map<String, Integer> searchStatistics = new HashMap<>();

	@Override
	public Result search(String keyword) {
		searchStatistics.put(keyword, searchStatistics.getOrDefault(keyword, 0) +1);
		return wrapee.search(keyword);
	}

}
