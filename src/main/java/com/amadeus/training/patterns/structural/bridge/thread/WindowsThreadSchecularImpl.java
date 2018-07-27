package com.amadeus.training.patterns.structural.bridge.thread;

public class WindowsThreadSchecularImpl implements ThreadSchedularImpl {

	@Override
	public void doSchedule(Thread thread) {
		System.out.println("Windows thread schedular");
	}

}
