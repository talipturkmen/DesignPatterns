package com.amadeus.training.patterns.behavioral.visitor.car;

public class PrintMeVisitor extends AbstractVisitor {
    @Override
    public void visit(Car car) {
        System.out.println("extending without affecting the class");
    }

}
