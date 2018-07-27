package com.amadeus.training.patterns.rot.solution;

public class StringReader implements Reader {
	private final String input;
	private int currentIndex;

	public StringReader(String input) {
		super();
		this.input = input;
	}

	@Override
	public boolean hasMore() {
		return currentIndex < input.length();
	}

	@Override
	public String read() {
		return String.valueOf(input.charAt(currentIndex++));
	}

}
