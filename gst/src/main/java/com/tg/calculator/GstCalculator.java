package com.technogise.calculator;

import com.technogise.item.domain.Item;
import org.springframework.stereotype.Component;

@Component
public class GstCalculator {

    public Double calculate(Item item) {
        return  item.getProductCategory().getTaxRate().getRate() * item.getPrice();
    }
}
