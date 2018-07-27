/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.template_method.algo;

import java.util.List;

/**
 * @author mohamd.dorra
 *
 */
public abstract class Algorithm {

	public final void execute() {
		List<Input> inputs = input();
		List<Item> process = process(inputs);
		output(process);
	}

	protected abstract List<Input> input();

	protected abstract List<Item> process(List<Input> inputs);

	protected abstract void output(List<Item> item);
}
