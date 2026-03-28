package com.example.order.strategy.shipping;

public class StandardShipping implements ShippingStrategy {
    public void ship() {
        System.out.println("Giao hàng tiêu chuẩn.");
    }
}