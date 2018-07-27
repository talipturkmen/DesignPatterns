/**
 * 
 */
package com.amadeus.training.patterns.behavioral.command;

/**
 * @author durrah
 *
 */
public abstract class AbstractEditorCommand implements Command {
	protected Editor editor;

	public AbstractEditorCommand(Editor editor) {
		super();
		this.editor = editor;
	}

}
