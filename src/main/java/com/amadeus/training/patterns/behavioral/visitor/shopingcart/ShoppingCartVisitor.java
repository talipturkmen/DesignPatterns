package com.amadeus.training.patterns.behavioral.visitor.shopingcart;


public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
