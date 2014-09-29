package com.trax.core.events.orders;

import com.trax.core.events.CreatedEvent;
import lombok.Getter;

import java.util.UUID;

/**
 * Created by SG0220142 on 7/20/2014.
 */
public class OrderCreatedEvent extends CreatedEvent{
    @Getter
    private final UUID newOrderKey;
    private final OrderDetails details;

    public OrderCreatedEvent(UUID newOrderKey, OrderDetails details) {
        this.newOrderKey = newOrderKey;
        this.details = details;
    }


}
