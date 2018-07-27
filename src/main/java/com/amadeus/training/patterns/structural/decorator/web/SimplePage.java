/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.decorator.web;

/**
 * @author mohamd.dorra
 *
 */
public class SimplePage implements WebPage {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amadeus.training.patterns.structural.decorator.WebPage#render()
	 */
	@Override
	public void render() {
		System.out.println("Simple page");
	}

}
