/**
 * 
 */
package com.amadeus.training.patterns.behavioral.command;

/**
 * @author durrah
 *
 */
public class BoldTextCommand extends AbstractEditorCommand {

	/**
	 * @param editor
	 */
	public BoldTextCommand(Editor editor) {
		super(editor);
	}

	@Override
	public void execute() {
		editor.text = "<b>" + editor.text + "</b>";
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
