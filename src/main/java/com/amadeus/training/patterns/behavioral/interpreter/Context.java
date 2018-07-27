package com.amadeus.training.patterns.behavioral.interpreter;

public class Context {
	enum Direction {
		LEFT, RIGHT, HEAD, NONE;

		static Direction ofString(String direction) {
			if (direction.equalsIgnoreCase("left"))
				return Direction.LEFT;
			if (direction.equalsIgnoreCase("right"))
				return Direction.RIGHT;
			return Direction.HEAD;
		}
	}

	Direction direction = Direction.HEAD;
	int steps;

	public Direction getDirection() {
		return direction;
	}

	public int getSteps() {
		return steps;
	}

	public void setDirection(Direction cDirection) {
		this.direction = cDirection;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public void doAction() {
		switch (direction) {
		case HEAD:
			for (int i = 0; i < steps; i++)
				System.out.println("⬇");
			break;
		case LEFT:
			System.out.println("➡");
			break;
		case RIGHT:
			System.out.println("⬅");
			break;

		default:
			break;
		}
	}
}
