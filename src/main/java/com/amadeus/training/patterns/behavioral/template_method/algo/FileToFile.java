/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.template_method.algo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mohamd.dorra
 *
 */
public class FileToFile extends Algorithm {

	@Override
	protected List<Input> input() {
		return Arrays.asList(new Input("input1"), new Input("input2"));
	}

	@Override
	protected List<Item> process(List<Input> inputs) {
		return inputs.stream().map(input -> new Item(input.value + "_output")).collect(Collectors.toList());
	}

	@Override
	protected void output(List<Item> items) {
		items.forEach(System.out::println);
	}

}
