package com.example.order.strategy.refund;

public class BankRefund implements RefundStrategy {
    public void refund() {
        System.out.println("Hoàn tiền qua ngân hàng.");
    }
}