package com.trax.core.events.orders;

import com.trax.core.events.ReadEvent;

import java.util.UUID;

/**
 * Created by SG0220142 on 7/20/2014.
 */
public class OrderStatusEvent extends ReadEvent{
    //class for order status event
    private UUID key;
    private OrderStatusDetails orderStatus;

    public OrderStatusEvent(UUID key) {
        this.key = key;
    }

    public OrderStatusEvent(UUID key, OrderStatusDetails orderStatus) {
        this.key = key;
        this.orderStatus = orderStatus;
    }

    public static OrderStatusEvent notFound(UUID key) {
        OrderStatusEvent ev = new OrderStatusEvent(key);
        ev.entityFound=false;
        return ev;
    }


}
