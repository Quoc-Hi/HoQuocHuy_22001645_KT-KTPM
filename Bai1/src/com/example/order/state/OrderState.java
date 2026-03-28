package com.example.order.state;

import com.example.order.context.Order;

public interface OrderState {
    void handle(Order order);
}