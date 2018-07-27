/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.observer;

import java.util.Observable;

/**
 * @author mohamd.dorra
 *
 */
public class UsersPage extends Observable {
	public UsersPage() {
		addObserver(new ListObserver());
		addObserver(new ChartObserver());
	}

	public void addUser(User user) {
		setChanged();
		notifyObservers(user);
	}
}
