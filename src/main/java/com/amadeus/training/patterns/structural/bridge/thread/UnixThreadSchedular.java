package com.amadeus.training.patterns.structural.bridge.thread;

public class UnixThreadSchedular implements ThreadSchedularImpl {

	@Override
	public void doSchedule(Thread thread) {
		System.out.println("Unix Thread Schedular");
	}

}
