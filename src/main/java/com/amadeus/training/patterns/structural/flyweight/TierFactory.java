/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.flyweight;

import java.util.EnumMap;

import com.amadeus.training.patterns.structural.flyweight.Tier.TierType;

/**
 * @author mohamd.dorra
 *
 */
public class TierFactory {

	private static TierFactory INSTANCE;

	private final EnumMap<TierType, Tier> tiers = new EnumMap<>(TierType.class);

	public static TierFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new TierFactory();
		}
		return INSTANCE;
	}

	Tier getFlyweight(String type) {
		TierType tierType = TierType.fromString(type);
		Tier tier = tiers.get(tierType);
		if (tier == null) {
			tier = new Tier(tierType);
			tiers.put(tierType, tier);
		}
		return tier;
	}

	Tier getTier(String type) {
		TierType tierType = TierType.fromString(type);
		return new Tier(tierType);
	}

}
