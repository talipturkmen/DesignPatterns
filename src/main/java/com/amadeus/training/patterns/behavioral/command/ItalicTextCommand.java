package com.amadeus.training.patterns.behavioral.command;

/**
 * 
 * @author durrah
 *
 */
public class ItalicTextCommand extends AbstractEditorCommand {

	public ItalicTextCommand(Editor editor) {
		super(editor);
	}

	@Override
	public void execute() {
		editor.text = "<i>" + editor.text + "</i>";
		editor.history(this);
	}

	@Override
	public void undo() {
		editor.text = editor.text.substring(3, editor.text.length() - 4);
	}

	@Override
	public boolean isUndoable() {
		return true;
	}

}
