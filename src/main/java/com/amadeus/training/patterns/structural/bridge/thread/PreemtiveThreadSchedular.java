package com.amadeus.training.patterns.structural.bridge.thread;

public class PreemtiveThreadSchedular extends AbstractThreadSchedular {

	public PreemtiveThreadSchedular(ThreadSchedularImpl impl) {
		super(impl);
	}

	@Override
	public void schedule(Thread thread) {
		impl.doSchedule(thread);
	}

}
