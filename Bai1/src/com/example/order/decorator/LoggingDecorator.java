package com.example.order.decorator;

import com.example.order.context.Order;

public class LoggingDecorator extends OrderDecorator {

    public LoggingDecorator(Order order) {
        super(order);
    }

    @Override
    public void process() {
        System.out.println("[LOG] Bắt đầu xử lý...");
        super.process();
        System.out.println("[LOG] Kết thúc xử lý...");
    }
}