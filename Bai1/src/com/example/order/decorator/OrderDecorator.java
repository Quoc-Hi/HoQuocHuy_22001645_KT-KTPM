package com.example.order.decorator;

import com.example.order.context.Order;

public abstract class OrderDecorator extends Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order order) {
        super(null, null);
        this.decoratedOrder = order;
    }

    @Override
    public void process() {
        decoratedOrder.process();
    }
}