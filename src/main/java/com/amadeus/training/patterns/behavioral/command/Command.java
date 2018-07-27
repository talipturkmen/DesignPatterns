/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.command;

/**
 * @author mohamd.dorra
 *
 */
public interface Command {
	void execute();

	void undo();

	boolean isUndoable();
}
