package com.example.payment.decorator;

import com.example.payment.context.Payment;

public class ProcessingFee extends PaymentDecorator {

    public ProcessingFee(Payment payment) {
        super(payment);
    }

    @Override
    public void process() {
        payment.setAmount(payment.getAmount() + 2);
        System.out.println("Thêm phí xử lý 2$");
        super.process();
    }
}