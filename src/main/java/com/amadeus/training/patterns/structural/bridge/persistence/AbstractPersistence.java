package com.amadeus.training.patterns.structural.bridge.persistence;

public abstract class AbstractPersistence implements Persistence {
    PersistenceImplementor implementor;

    public AbstractPersistence(PersistenceImplementor implementor) {
        this.implementor = implementor;
    }


    public void setImplementor(PersistenceImplementor implementor) {
        this.implementor = implementor;
    }

}
