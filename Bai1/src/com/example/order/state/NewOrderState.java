package com.example.order.state;

import com.example.order.context.Order;

public class NewOrderState implements OrderState {
    public void handle(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        order.setState(new ProcessingState());
    }
}