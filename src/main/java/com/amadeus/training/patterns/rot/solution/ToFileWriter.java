package com.amadeus.training.patterns.rot.solution;

import java.io.FileWriter;
import java.io.IOException;

public class ToFileWriter implements Writer {
	final FileWriter fileWriter;

	public ToFileWriter(FileWriter fileWriter) {
		super();
		this.fileWriter = fileWriter;
	}

	@Override
	public void write(String read) {
		try {
			fileWriter.write(read);
			fileWriter.flush();
		} catch (IOException e) {
			// ignore
		}
	}


	public void flush() {
		try {
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// ignore
		}
	}

}
