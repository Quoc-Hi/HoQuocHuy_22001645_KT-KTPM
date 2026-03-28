package com.example.tax.state;

import com.example.tax.context.Product;
import com.example.tax.strategy.LuxuryTax;

public class LuxuryState implements ProductState {
    public double handleTax(Product product) {
        return new LuxuryTax().calculateTax(product.getPrice());
    }
}