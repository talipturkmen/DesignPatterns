/**
 * 
 */
package com.amadeus.training.patterns.structural.bridge.thread;

/**
 * @author durrah
 *
 */
public abstract class AbstractThreadSchedular implements ThreadSchedular {

	ThreadSchedularImpl impl;

	public AbstractThreadSchedular(ThreadSchedularImpl impl) {
		super();
		this.impl = impl;
	}

	public void setImpl(ThreadSchedularImpl impl) {
		this.impl = impl;
	}
}
