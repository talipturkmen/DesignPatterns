package com.amadeus.training.patterns.rot;

import java.io.IOException;

public class Runner {
	public static void main(String[] args) {
		try {
			new KeyboardToFileCopier().copy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
