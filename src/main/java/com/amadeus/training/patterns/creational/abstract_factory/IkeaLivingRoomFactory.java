package com.amadeus.training.patterns.creational.abstract_factory;

import com.amadeus.training.patterns.creational.abstract_factory.models.Chair;
import com.amadeus.training.patterns.creational.abstract_factory.models.FabricSofa;
import com.amadeus.training.patterns.creational.abstract_factory.models.IkeaChair;
import com.amadeus.training.patterns.creational.abstract_factory.models.IkeaTable;
import com.amadeus.training.patterns.creational.abstract_factory.models.Sofa;
import com.amadeus.training.patterns.creational.abstract_factory.models.Table;

public class IkeaLivingRoomFactory extends LivingRoomFactory {

	@Override
	Chair makeChair() {
		return new IkeaChair();
	}

	@Override
	Table makeTable() {
		return new IkeaTable();
	}

	@Override
	Sofa makeSofa() {
		return new FabricSofa();
	}

}
