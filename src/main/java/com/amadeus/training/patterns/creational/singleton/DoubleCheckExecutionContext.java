package com.amadeus.training.patterns.creational.singleton;

public class DoubleCheckExecutionContext {
    private static DoubleCheckExecutionContext INSTANCE;

    private DoubleCheckExecutionContext() {
    }

    public static DoubleCheckExecutionContext getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckExecutionContext.class) {
                if (INSTANCE == null)
                    INSTANCE = new DoubleCheckExecutionContext();
            }
        }
        return INSTANCE;
    }

    public void doSomething() {
    }
}
