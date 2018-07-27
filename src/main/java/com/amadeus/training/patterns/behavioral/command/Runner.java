package com.amadeus.training.patterns.behavioral.command;

public class Runner {

	public static void main(String[] args) {
		Editor editor = new Editor("text");

		new BoldTextCommand(editor).execute();

		System.err.println(editor.text);

		new ItalicTextCommand(editor).execute();

		System.err.println(editor.text);

		editor.restore();

		System.err.println(editor.text);

		editor.restore();

		System.err.println(editor.text);

	}

}
