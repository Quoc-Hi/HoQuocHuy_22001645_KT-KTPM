package com.example.payment.state;

import com.example.payment.context.Payment;

public class FailedState implements PaymentState {
    public void handle(Payment payment) {
        System.out.println("Thanh toán thất bại.");
    }
}