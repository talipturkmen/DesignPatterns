/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.decorator.web;

/**
 * @author mohamd.dorra
 *
 */
public class HorizontalScrollableWebPage extends WebPageDecorator {

	/**
	 * @param page
	 */
	public HorizontalScrollableWebPage(WebPage page) {
		super(page);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.amadeus.training.patterns.structural.decorator.WebPageDecorator#render()
	 */
	@Override
	public void render() {
		page.render();
		System.out.println("==============");
	}

}
