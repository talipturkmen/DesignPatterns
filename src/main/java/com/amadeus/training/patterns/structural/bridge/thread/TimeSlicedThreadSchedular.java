package com.amadeus.training.patterns.structural.bridge.thread;

public class TimeSlicedThreadSchedular extends AbstractThreadSchedular {

	public TimeSlicedThreadSchedular(ThreadSchedularImpl impl) {
		super(impl);
	}

	@Override
	public void schedule(Thread thread) {
		impl.doSchedule(thread);
	}

}
