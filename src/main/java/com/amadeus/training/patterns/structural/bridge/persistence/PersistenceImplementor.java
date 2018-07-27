package com.amadeus.training.patterns.structural.bridge.persistence;

public interface PersistenceImplementor {
    Object getObject(String objectId);
    void persistObject(Object object);

    void deleteAll();
}
