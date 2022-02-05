package com.technogise.cart.domain;

import com.technogise.item.domain.Item;

import java.util.Map;

public class Cart {

    private Map<Integer, Item> items;

    public Cart(Map<Integer, Item> items) {
        this.items = items;
    }

    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }
}
