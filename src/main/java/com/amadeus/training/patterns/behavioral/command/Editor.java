/**
 * 
 */
package com.amadeus.training.patterns.behavioral.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author durrah
 *
 */
public class Editor {
	Deque<Command> history;
	public String text;

	public Editor(String text) {
		super();
		history = new LinkedList<>();
		this.text = text;
	}

	public void history(Command command) {
		history.push(command);
	}

	public void restore() {
		if (!history.isEmpty()) {
			Command head = history.pop();
			if (head.isUndoable())
				head.undo();
		}
	}

}
