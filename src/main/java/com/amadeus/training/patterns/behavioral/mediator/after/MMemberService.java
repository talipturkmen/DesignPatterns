package com.amadeus.training.patterns.behavioral.mediator.after;

public class MMemberService extends AbstractService {

	public MMemberService(Organizer organizer) {
		super(organizer);
	}

	void create(Member member) {
		organizer.create(member);
	}

	public void updateStatus() {

	}
}
