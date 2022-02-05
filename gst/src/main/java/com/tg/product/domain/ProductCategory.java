package com.technogise.product.domain;

import com.technogise.tax.domain.TaxRate;

public class ProductCategory {

    private TaxRate taxRate;

    public TaxRate getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }
}
