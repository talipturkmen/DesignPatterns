/**
 * 
 */
package com.amadeus.training.patterns.creational.singleton;

/**
 * @author durrah
 *
 */
public class LazyExecutionContext {
	private static LazyExecutionContext INSTANCE;

	private LazyExecutionContext() {
	}

	public static LazyExecutionContext getInstance() {
		if (INSTANCE == null) {
			synchronized (LazyExecutionContext.class) {
				INSTANCE = new LazyExecutionContext();
			}

		}
		return INSTANCE;
	}

	public void doSomething() {
	}
}
