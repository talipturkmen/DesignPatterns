package com.amadeus.training.patterns.creational.builder;

import com.amadeus.training.patterns.creational.builder.models.Campaign;
import com.amadeus.training.patterns.creational.builder.models.Campaign.AdsType;

public class SponsorshipBuilder extends CampaignBuilder {
	Campaign campaign = new Campaign();

	@Override
	public Campaign build() {
		return campaign;
	}

	@Override
	public CampaignBuilder brochures() {
		campaign.setBrochuresCount(1000);
		return this;
	}

	@Override
	public CampaignBuilder ads() {
		campaign.setAdsType(AdsType.A);
		return this;
	}

}
