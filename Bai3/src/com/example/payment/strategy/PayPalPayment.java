package com.example.payment.strategy;

public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}