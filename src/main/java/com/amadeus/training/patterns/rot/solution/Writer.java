package com.amadeus.training.patterns.rot.solution;

public interface Writer {

	void write(String read);
}

interface FlushableWriter extends Writer{
	void flush();
}

