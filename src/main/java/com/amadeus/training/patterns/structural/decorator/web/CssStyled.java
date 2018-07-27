/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.decorator.web;

/**
 * @author mohamd.dorra
 *
 */
public class CssStyled extends WebPageDecorator {

	/**
	 * @param page
	 */
	public CssStyled(WebPage page) {
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
		System.out.println(".body{background-color: #005bb8}");
	}

}
