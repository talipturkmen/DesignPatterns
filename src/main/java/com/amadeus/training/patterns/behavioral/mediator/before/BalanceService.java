package com.amadeus.training.patterns.behavioral.mediator.before;

public class BalanceService {
	TierService tierService;
	MemberService memberService;

	void addPoints(Member member, int points) {
		if (points > 1000) {
			memberService.updateStatus();
			tierService.upgradeTier(member);
		}
	}

	public int balance(Member member) {
		return 0;
	}
}
