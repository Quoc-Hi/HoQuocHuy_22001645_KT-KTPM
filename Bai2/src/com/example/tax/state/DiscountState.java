package com.example.tax.state;

import com.example.tax.context.Product;

public class DiscountState implements ProductState {
    public double handleTax(Product product) {
        double discountedPrice = product.getPrice() * 0.9;
        return product.getTaxStrategy().calculateTax(discountedPrice);
    }
}