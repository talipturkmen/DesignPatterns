package com.amadeus.training.patterns.behavioral.visitor.car;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		Engine engine = new Engine(Arrays.asList(new Valve("V1"), new Valve("V2"), new Valve("V3")));
		Car car = Car.of(engine, Arrays.asList(new Tire("FR"), new Tire("FL"), new Tire("RR"), new Tire("RL")));

		car.accept(new CountVisitor());
		car.accept(new CheckVisitor());
	}

}
