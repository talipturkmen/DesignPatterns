package com.amadeus.training.patterns.structural.decorator.web;

/**
 * css + horizonal
 */
public class ABPage implements WebPage {
    @Override
    public void render() {
        addCss();
        addHS();
    }

    private void addCss() {
    }

    private void addHS() {
    }
}
