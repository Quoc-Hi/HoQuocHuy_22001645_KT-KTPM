package com.example.payment.decorator;

import com.example.payment.context.Payment;

public class Discount extends PaymentDecorator {

    public Discount(Payment payment) {
        super(payment);
    }

    @Override
    public void process() {
        payment.setAmount(payment.getAmount() - 5);
        System.out.println("Áp dụng giảm giá 5$");
        super.process();
    }
}