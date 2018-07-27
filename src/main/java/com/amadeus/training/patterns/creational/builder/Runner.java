package com.amadeus.training.patterns.creational.builder;

import com.amadeus.training.patterns.creational.builder.chain.User;

public class Runner {

	public static void main(String[] args) {
		final CampaignBuilder builder = new SponsorshipBuilder();

        final CampaignBuildDirector campaignBuildDirector = new CampaignBuildDirector(builder);

		User user =User.UserBuilder.create().city("").firstName("").build();
	}

}
