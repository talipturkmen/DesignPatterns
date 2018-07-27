package com.amadeus.training.patterns.rot.solution;

public class Copier {
	final Reader reader;
	final Writer writer;

	public Copier(Reader reader, FlushableWriter writer) {
		super();
		this.reader = reader;
		this.writer = writer;
	}

	void startCopy() {
		while (reader.hasMore()) {
			String read = reader.read();
			writer.write(read);
			writer.write(System.lineSeparator());
		}
	}

}
