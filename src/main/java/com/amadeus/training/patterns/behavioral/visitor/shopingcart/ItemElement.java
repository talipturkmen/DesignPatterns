package com.amadeus.training.patterns.behavioral.visitor.shopingcart;

public abstract interface ItemElement {
    public int accept(ShoppingCartVisitor visitor) ;
}
