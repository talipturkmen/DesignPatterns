/**
 * 
 */
package com.amadeus.training.patterns.creational.singleton;

/**
 * @author durrah
 *
 */
public class ExecutionContext {
	private static final ExecutionContext INSTANCE = new ExecutionContext();

	private ExecutionContext() {
		// prepareConfigurations()
	}

	public static ExecutionContext getInstance() {
		return INSTANCE;
	}

	public void doSomething() {
	}
}
