package com.amadeus.training.patterns.behavioral.mediator.after;

public class MCardService extends AbstractService {
	public MCardService(Organizer organizer) {
		super(organizer);
	}

	void reissueCard(Member member) {
		organizer.reissueCard(member);
	}

	void issueCard(Member member) {
		organizer.issueCard(member);
	}
}
