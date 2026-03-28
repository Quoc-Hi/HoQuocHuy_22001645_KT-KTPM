package com.example.payment.state;

import com.example.payment.context.Payment;

public class PendingState implements PaymentState {
    public void handle(Payment payment) {
        System.out.println("Đang xử lý thanh toán...");
        payment.setState(new CompletedState());
    }
}