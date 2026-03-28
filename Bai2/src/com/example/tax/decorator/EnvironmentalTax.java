package com.example.tax.decorator;

import com.example.tax.context.Product;

public class EnvironmentalTax extends TaxDecorator {

    public EnvironmentalTax(Product product) {
        super(product);
    }

    @Override
    public double calculateTax() {
        return super.calculateTax() + 2.0;
    }
}