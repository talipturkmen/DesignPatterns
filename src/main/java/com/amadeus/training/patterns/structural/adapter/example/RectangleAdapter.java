package com.amadeus.training.patterns.structural.adapter.example;


public class RectangleAdapter implements Target {
    Rectangle rectangle;


    @Override
    public void draw(int x0, int y0, int x1, int y1) {
        rectangle.draw(x0, y0, x1-x0, y1-y0);
    }
}
