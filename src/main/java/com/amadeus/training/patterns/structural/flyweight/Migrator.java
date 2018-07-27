/*
 * © 2018 Copyright Amadeus Unauthorized use and disclosure strictly forbidden.
 */
package com.amadeus.training.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author mohamd.dorra
 *
 */
public class Migrator {
	final static String[] plainTierTypes = { "blue", "silver", "gold" };

	public static void main(String[] args) {
		List<PlainMember> membersToMigrate = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			int idx = random.nextInt(3);
			membersToMigrate.add(new PlainMember("id_" + i, plainTierTypes[idx]));
		}
		TierFactory tierFactory = TierFactory.getInstance();

		List<Member> migratedMembers = membersToMigrate.parallelStream().map(member -> {
			Tier tier = tierFactory.getFlyweight(member.tierType);
			tier.setId(String.valueOf(random.nextInt()));
			return new Member(member.id, tier);
		}).collect(Collectors.toList());

		migratedMembers.forEach(member -> System.out.println(member.id + ":" + member.tier.type));
	}

}
