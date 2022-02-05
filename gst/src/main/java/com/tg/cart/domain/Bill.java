package com.technogise.cart.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Bill {

    private Double tax;
    private Double totalTax;

    public Bill(Double tax, Double totalTax) {
        this.tax = tax;
        this.totalTax = totalTax;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Double totalTax) {
        this.totalTax = totalTax;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
