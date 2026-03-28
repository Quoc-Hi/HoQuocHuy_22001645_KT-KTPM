package com.example.payment.context;

import com.example.payment.state.*;
import com.example.payment.strategy.PaymentStrategy;

public class Payment {
    protected double amount;
    protected PaymentStrategy strategy;
    protected PaymentState state;

    public Payment(double amount, PaymentStrategy strategy) {
        this.amount = amount;
        this.strategy = strategy;
        this.state = new PendingState();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void process() {
        strategy.pay(amount);
        state.handle(this);
    }
}