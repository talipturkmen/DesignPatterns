package com.amadeus.training.patterns.behavioral.mediator.after;

public class Organizer {
	MTierService tierService;
	MMemberService memberService;
	MCardService cardService;
	MBalanceService balanceService;

	public void create(Member member) {
		balanceService.addPoints(member, 100);
		tierService.createNewTier(member);
	}

	public void addPoints(Member member, int points) {
		if (points > 1000) {
			memberService.updateStatus();
			tierService.upgradeTier(member);
		}
	}

	void reissueCard(Member member) {
		memberService.updateStatus();
		balanceService.addPoints(member, -100);
	}

	void issueCard(Member member) {
		memberService.updateStatus();
		if (balanceService.balance(member) < 1000)
			tierService.downgradeTier(member);
	}

	public void upgradeTier(Member member) {

	}
}
