package com.amadeus.training.patterns.behavioral.mediator.before;

public class Runner {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		TierService tierService = new TierService();
		CardService cardService = new CardService();
		BalanceService balanceService = new BalanceService();

		memberService.create(new Member());
	}
}
