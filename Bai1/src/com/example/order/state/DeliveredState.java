package com.example.order.state;

import com.example.order.context.Order;

public class DeliveredState implements OrderState {
    public void handle(Order order) {
        System.out.println("Đơn hàng đã giao thành công.");
    }
}