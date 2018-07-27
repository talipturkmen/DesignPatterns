package com.amadeus.training.patterns.structural.bridge.persistence;

public class FilePersistenceImplementor implements PersistenceImplementor {
    @Override
    public Object getObject(String objectId) {
        // write to some file
        return null;
    }

    @Override
    public void persistObject(Object object) {

    }

    @Override
    public void deleteAll() {

    }
}
