package com.amadeus.training.patterns.behavioral.mediator.after;

public class MTierService extends AbstractService implements ITierSerive {
	public MTierService(Organizer organizer) {
		super(organizer);
	}

	public void upgradeTier(Member member) {
		organizer.upgradeTier(member);
	}

	public void createNewTier(Member member) {

	}

	public void downgradeTier(Member member) {

	}
}
