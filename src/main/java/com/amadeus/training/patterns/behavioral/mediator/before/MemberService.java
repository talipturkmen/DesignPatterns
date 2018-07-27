package com.amadeus.training.patterns.behavioral.mediator.before;

public class MemberService {
	TierService tierService;
	CardService cardService;
	BalanceService balanceService;

	void create(Member member) {
		balanceService.addPoints(member, 100);
		tierService.createNewTier(member);
	}

	public void updateStatus() {

	}
}
