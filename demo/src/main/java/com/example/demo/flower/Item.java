package com.example.demo.flower;

import lombok.Getter;
import lombok.Setter;

public abstract class Item {
    @Getter @Setter
    private String description;
    public abstract double getPrice();
}