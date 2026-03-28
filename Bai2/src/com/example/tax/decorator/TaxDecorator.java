package com.example.tax.decorator;

import com.example.tax.context.Product;
import com.example.tax.state.ProductState;

public abstract class TaxDecorator extends Product {
    protected Product product;

    public TaxDecorator(Product product) {
        super(product.getPrice(), product.getTaxStrategy());
        this.product = product;
    }

    @Override
    public double calculateTax() {
        return product.calculateTax();
    }

    @Override
    public void setState(ProductState state) {
        product.setState(state);
    }
}