package com.example.order.context;

import com.example.order.state.*;
import com.example.order.strategy.refund.RefundStrategy;
import com.example.order.strategy.shipping.ShippingStrategy;

public class Order {
    protected OrderState state;
    protected ShippingStrategy shippingStrategy;
    protected RefundStrategy refundStrategy;

    public Order(ShippingStrategy shippingStrategy, RefundStrategy refundStrategy) {
        this.state = new NewOrderState();
        this.shippingStrategy = shippingStrategy;
        this.refundStrategy = refundStrategy;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }

    public void ship() {
        if (shippingStrategy != null) {
            shippingStrategy.ship();
        }
    }

    public void refund() {
        if (refundStrategy != null) {
            refundStrategy.refund();
        }
    }
}