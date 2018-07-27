package com.amadeus.training.patterns.creational.abstract_factory;

import com.amadeus.training.patterns.creational.abstract_factory.models.Chair;
import com.amadeus.training.patterns.creational.abstract_factory.models.Sofa;
import com.amadeus.training.patterns.creational.abstract_factory.models.Table;

public abstract class LivingRoomFactory {
	abstract Chair makeChair();

	abstract Sofa makeSofa();

	abstract Table makeTable();
}
