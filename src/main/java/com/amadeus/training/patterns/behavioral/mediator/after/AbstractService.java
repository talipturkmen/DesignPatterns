package com.amadeus.training.patterns.behavioral.mediator.after;

public class AbstractService implements Service {
	protected Organizer organizer;

	public AbstractService(Organizer organizer) {
		super();
		this.organizer = organizer;
	}

}
