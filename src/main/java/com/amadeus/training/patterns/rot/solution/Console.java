package com.amadeus.training.patterns.rot.solution;

public class Console implements Writer {

	@Override
	public void write(String read) {
		System.out.println(read);
	}

}
