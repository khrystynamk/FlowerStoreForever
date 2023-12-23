package com.example.demo.decorators;

import com.example.demo.flower.Item;

import lombok.Getter;
import lombok.Setter;

public abstract class ItemDecorator extends Item {
    @Getter @Setter
    private Item item;

    public ItemDecorator(Item source) {
        this.item = source;
    }
}
