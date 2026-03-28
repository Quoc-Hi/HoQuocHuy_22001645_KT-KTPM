package com.example.order.strategy.shipping;

public class ExpressShipping implements ShippingStrategy {
    public void ship() {
        System.out.println("Giao hàng nhanh.");
    }
}