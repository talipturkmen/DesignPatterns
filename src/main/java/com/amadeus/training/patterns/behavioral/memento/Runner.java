package com.amadeus.training.patterns.behavioral.memento;

public class Runner {

	public static void main(String[] args) {
		MementoEditor editor = new MementoEditor("");
		String [] split = "The quick brown fox jumps over the lazy dog".split("\\s");
		for (int i=0;i<split.length;i++) {
			editor.execute(new AppendCommand(editor, split[i]), i==2);
			System.out.println(editor.text);
		}

		while (editor.canRestore()) {
			editor.restore();

			System.out.println(editor.text);
		}
	}
}
