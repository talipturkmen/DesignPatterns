package com.amadeus.training.patterns.creational.builder;

import com.amadeus.training.patterns.creational.builder.models.Campaign;

public class CampaignBuildDirector {
	private CampaignBuilder builder;

	public CampaignBuildDirector(CampaignBuilder builder) {
		this.builder = builder;
	}

	public Campaign construct() {
		return builder.brochures().ads().build();
	}

}
