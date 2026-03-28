package com.example.order.decorator;

import com.example.order.context.Order;

public class NotificationDecorator extends OrderDecorator {

    public NotificationDecorator(Order order) {
        super(order);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("[NOTIFY] Gửi thông báo cho khách hàng.");
    }
}