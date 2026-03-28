package com.example.tax.state;

import com.example.tax.context.Product;

public class NormalState implements ProductState {
    public double handleTax(Product product) {
        return product.getTaxStrategy().calculateTax(product.getPrice());
    }
}