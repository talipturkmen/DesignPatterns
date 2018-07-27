package com.amadeus.training.patterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class CareTracker {
	Deque<Memento> mementos;

	public CareTracker() {
		mementos = new ArrayDeque<>();
	}

	void track(Memento memento) {
		mementos.push(memento);
	}

	Memento restore() {
		return mementos.pop();
	}

	public boolean canRestore() {
		return !mementos.isEmpty();
	}
}
