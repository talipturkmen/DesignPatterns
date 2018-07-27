package com.amadeus.training.patterns.behavioral.visitor.car;

public class CheckVisitor implements Visitor {

	@Override
	public void visit(Car car) {
		System.out.println("Check Chase");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Check Engine");
	}

	@Override
	public void visit(Tire tire) {
		System.out.println("Check Tire " + tire.side);
	}

	@Override
	public void visit(Valve valve) {
		System.out.println("Check Valve " + valve.name);
	}

	@Override
	public void stats() {

	}

}
