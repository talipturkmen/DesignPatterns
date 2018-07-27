/**
 * 
 */
package com.amadeus.training.patterns.structural.bridge.thread;

/**
 * @author durrah
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadSchedularImpl impl = new WindowsThreadSchecularImpl();
		ThreadSchedular schecular = new PreemtiveThreadSchedular(impl);


		schecular.schedule(new Thread());


		schecular = new TimeSlicedThreadSchedular(impl);

		schecular = new PreemtiveThreadSchedular(new JVMThreadSchdular());
	}

}
