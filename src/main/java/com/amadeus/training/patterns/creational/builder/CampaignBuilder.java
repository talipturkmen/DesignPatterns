package com.amadeus.training.patterns.creational.builder;

import com.amadeus.training.patterns.creational.builder.models.Campaign;

public abstract class CampaignBuilder implements Builder<Campaign> {

	public abstract CampaignBuilder brochures();

	public abstract CampaignBuilder ads();

}
