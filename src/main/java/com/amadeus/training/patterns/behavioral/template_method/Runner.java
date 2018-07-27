/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.template_method;

import com.amadeus.training.patterns.behavioral.template_method.algo.FileToFile;

/**
 * @author mohamd.dorra
 *
 */
public class Runner {
	public static void main(String[] args) {
		new FileToFile().execute();
	}
}
