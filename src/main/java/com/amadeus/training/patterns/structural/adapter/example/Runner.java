package com.amadeus.training.patterns.structural.adapter.example;

public class Runner {
    public static void main(String[] args) {
        Target target = new RectangleAdapter();

        target.draw(0,0,10,10);
    }
}
