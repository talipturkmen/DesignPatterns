/**
 * 
 */
package com.amadeus.training.patterns.structural.bridge.thread;

/**
 * @author durrah
 *
 */
public class JVMThreadSchdular implements ThreadSchedularImpl {

	@Override
	public void doSchedule(Thread thread) {
		System.out.println("JVM thread schedular");
	}

}
