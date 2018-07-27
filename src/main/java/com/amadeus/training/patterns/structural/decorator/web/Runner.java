/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.decorator.web;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author mohamd.dorra
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		new BufferedInputStream(new LineInputStream(new FileInputStream(new File(""))));
	}

}
