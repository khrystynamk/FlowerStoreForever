package com.example.demo.filters;
import com.example.demo.flower.Item;

public interface Filter {
    boolean match(Item item);
}