package com.amadeus.training.patterns.creational.singleton;

public class ExecutionContextHolder {

	private ExecutionContextHolder() {
	}

	public static class LoggerHolder {
		public static ExecutionContextHolder logger = new ExecutionContextHolder();
	}
	// somthinghere

	/// somthinghere

	public static ExecutionContextHolder getInstance() {
		return LoggerHolder.logger;
	}

	public void doSomething() {
	}

	Object readResolve(){
		return  LoggerHolder.logger;
	}
}
