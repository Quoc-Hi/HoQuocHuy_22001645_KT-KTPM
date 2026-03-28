package com.example.tax.context;

import com.example.tax.state.*;
import com.example.tax.strategy.TaxStrategy;

public class Product {
    protected double price;
    protected TaxStrategy taxStrategy;
    protected ProductState state;

    public Product(double price, TaxStrategy taxStrategy) {
        this.price = price;
        this.taxStrategy = taxStrategy;
        this.state = new NormalState();
    }

    public double getPrice() {
        return price;
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public double calculateTax() {
        return state.handleTax(this);
    }
}