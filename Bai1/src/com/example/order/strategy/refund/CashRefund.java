package com.example.order.strategy.refund;

public class CashRefund implements RefundStrategy {
    public void refund() {
        System.out.println("Hoàn tiền tiền mặt.");
    }
}