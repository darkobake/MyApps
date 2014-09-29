package com.trax.core.events.orders;

import com.trax.core.events.ReadEvent;

import java.util.UUID;

/**
 * Created by SG0220142 on 7/20/2014.
 */
public class OrderDetailsEvent extends ReadEvent{
    private UUID key;
    private OrderDetails orderDetails;

    public OrderDetailsEvent(UUID key) {
        this.key = key;
    }

    public OrderDetailsEvent(UUID key, OrderDetails orderDetails) {
        this.key = key;
        this.orderDetails = orderDetails;
    }

    public static OrderDetailsEvent notFound(UUID key) {
        OrderDetailsEvent ev = new OrderDetailsEvent(key);
        ev.entityFound=false;
        return ev;
    }

}
