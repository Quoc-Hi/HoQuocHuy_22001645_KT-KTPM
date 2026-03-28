package com.example.tax.state;

import com.example.tax.context.Product;

public interface ProductState {
    double handleTax(Product product);
}