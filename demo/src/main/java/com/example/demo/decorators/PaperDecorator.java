package com.example.demo.decorators;

import com.example.demo.flower.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        final int PRICE = 13;
        return PRICE + this.getItem().getPrice();
    }
}
