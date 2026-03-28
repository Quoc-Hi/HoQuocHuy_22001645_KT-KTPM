package com.example.payment.decorator;

import com.example.payment.context.Payment;

public abstract class PaymentDecorator extends Payment {
    protected Payment payment;

    public PaymentDecorator(Payment payment) {
        super(payment.getAmount(), null);
        this.payment = payment;
    }

    @Override
    public double getAmount() {
        return payment.getAmount();
    }

    @Override
    public void setAmount(double amount) {
        payment.setAmount(amount);
    }

    @Override
    public void process() {
        payment.process();
    }
}