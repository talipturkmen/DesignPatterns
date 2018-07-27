/**
 * 
 */
package com.amadeus.training.patterns.behavioral.memento;

import com.amadeus.training.patterns.behavioral.command.Command;
import com.amadeus.training.patterns.behavioral.command.Editor;

/**
 * @author durrah
 *
 */
public class MementoEditor extends Editor {
	CareTracker tracker;

	public MementoEditor(String text) {
		super(text);
		tracker = new CareTracker();
		this.text = text;
	}

	public void execute(Command command, boolean saveSnapshot) {
		if(saveSnapshot) tracker.track(new Memento(text));
		command.execute();
	}

	public boolean canRestore() {
		return tracker.canRestore();
	}

	public void restore() {
		if (canRestore()) {
			Memento previous = tracker.restore();
			this.text = previous.state;
		}

	}

}
