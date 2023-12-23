package com.example.demo.decorators;

import com.example.demo.flower.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        final int PRICE = 4;
        return PRICE + this.getItem().getPrice();
    }
}
