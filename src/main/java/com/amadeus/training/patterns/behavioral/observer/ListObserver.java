/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author mohamd.dorra
 *
 */
public class ListObserver implements Observer {
	List<User> users = new ArrayList<>();

	@Override
	public void update(Observable o, Object obj) {
		if (obj instanceof User) {
			users.add((User) obj);
		}
		users.forEach(acc -> System.out.println(acc.name + " : " + acc.gender));
	}
}
