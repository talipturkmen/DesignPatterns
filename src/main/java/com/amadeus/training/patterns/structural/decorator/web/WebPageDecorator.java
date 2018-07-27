/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.decorator.web;

/**
 * @author mohamd.dorra
 *
 */
public abstract class WebPageDecorator implements WebPage {
	protected WebPage page;

	/**
	 * @param page
	 */
	public WebPageDecorator(WebPage page) {
		super();
		this.page = page;
	}
}
