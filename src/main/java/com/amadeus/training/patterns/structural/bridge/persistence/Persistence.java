package com.amadeus.training.patterns.structural.bridge.persistence;

public interface Persistence {

    void persist(Object object);

    Object retrieve(String id);


    void delete(String id);

}