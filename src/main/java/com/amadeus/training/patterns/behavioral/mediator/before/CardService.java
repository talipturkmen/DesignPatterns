package com.amadeus.training.patterns.behavioral.mediator.before;

public class CardService {
	MemberService memberService;
	BalanceService balanceService;
	TierService tierService;

	void reissueCard(Member member) {
		memberService.updateStatus();
		balanceService.addPoints(member, -100);
	}

	void issueCard(Member member) {
		memberService.updateStatus();
		if(balanceService.balance(member)<1000)
		tierService.downgradeTier(member);
	}
}
