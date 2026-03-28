package com.example.order.state;

import com.example.order.context.Order;

public class ProcessingState implements OrderState {
    public void handle(Order order) {
        System.out.println("Đóng gói và vận chuyển...");
        order.ship();
        order.setState(new DeliveredState());
    }
}