package com.amadeus.training.patterns.structural.bridge.persistence;

public class OrmPersistence extends AbstractPersistence{
    public OrmPersistence(PersistenceImplementor implementor) {
        super(implementor);
    }

    @Override
    public void persist(Object object) {
        implementor.persistObject(object);
    }

    @Override
    public Object retrieve(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
class Runner {

    public static void main(String[] args) {

        PersistenceImplementor implementor = new DatabasePersisteceImplementor();
        Persistence p = new OrmPersistence(implementor);
        p.persist(null);
    }
}