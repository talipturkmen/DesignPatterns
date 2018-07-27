package com.amadeus.training.patterns.behavioral.mediator.after;

public class MBalanceService extends AbstractService {

	public MBalanceService(Organizer organizer) {
		super(organizer);
	}

	void addPoints(Member member, int points) {
		organizer.addPoints(member, points);
	}

	public int balance(Member member) {
		return 0;
	}
}
