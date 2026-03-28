package com.example.order.state;

import com.example.order.context.Order;

public class CancelledState implements OrderState {
    public void handle(Order order) {
        System.out.println("Hủy đơn hàng...");
        order.refund();
    }
}