package com.amadeus.training.patterns.behavioral.mediator.after;

public class Runner {
	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		MMemberService memberService = new MMemberService(organizer);
		MCardService cardService = new MCardService(organizer);
		MBalanceService balanceService = new MBalanceService(organizer);
		MTierService tierService = new MTierService(organizer);

		memberService.create(new Member());
	}
}
