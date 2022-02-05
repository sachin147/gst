package com.technogise.cart.service;

import com.technogise.calculator.GstCalculator;
import com.technogise.cart.domain.Bill;
import com.technogise.cart.domain.Cart;
import com.technogise.item.domain.Item;

import java.util.Map;

public class CartService {

    private GstCalculator gstCalculator;

    public CartService(GstCalculator gstCalculator) {
        this.gstCalculator = gstCalculator;
    }

    public String printBill(Cart cart) {
        StringBuilder finalBill = new StringBuilder();
        Map<Integer, Item> itemMap =  cart.getItems();
        for(Map.Entry<Integer, Item> itemEntry : itemMap.entrySet()) {
            Double tax = gstCalculator.calculate(itemEntry.getValue());
            Bill bill = new Bill(tax, itemEntry.getKey() * (tax + itemEntry.getValue().getPrice()) );
            System.out.println(bill);
            finalBill.append(bill.toString());
        }
        return finalBill.toString();
    }
}
