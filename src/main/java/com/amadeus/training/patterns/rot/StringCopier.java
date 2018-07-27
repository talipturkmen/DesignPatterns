package com.amadeus.training.patterns.rot;

public class StringCopier {
	private String string;

	public StringCopier(String string) {
		super();
		this.string = string;
	}

	void copy() {
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
	}
}
