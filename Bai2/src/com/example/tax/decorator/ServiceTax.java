package com.example.tax.decorator;

import com.example.tax.context.Product;

public class ServiceTax extends TaxDecorator {

    public ServiceTax(Product product) {
        super(product);
    }

    @Override
    public double calculateTax() {
        return super.calculateTax() + 1.0;
    }
}