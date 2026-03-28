package com.example.payment;

import com.example.payment.context.Payment;
import com.example.payment.decorator.Discount;
import com.example.payment.decorator.ProcessingFee;
import com.example.payment.strategy.CreditCardPayment;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment(100, new CreditCardPayment());

        // Decorator: thêm phí + giảm giá
        payment = new ProcessingFee(payment);
        payment = new Discount(payment);

        payment.process();
    }
}