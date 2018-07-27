package com.amadeus.training.patterns.behavioral.memento;

import com.amadeus.training.patterns.behavioral.command.AbstractEditorCommand;
import com.amadeus.training.patterns.behavioral.command.Editor;

public class AppendCommand extends AbstractEditorCommand {

	private String append;

	public AppendCommand(Editor editor, String string) {
		super(editor);
		this.append = string;
	}

	@Override
	public void execute() {
		editor.text += " " + append;
	}

	@Override
	public void undo() {
	}

	@Override
	public boolean isUndoable() {
		return false;
	}

}