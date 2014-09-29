package com.trax.core.events.orders;

import com.trax.core.events.ReadEvent;
import lombok.Getter;

import java.util.List;

/**
 * Created by SG0220142 on 7/20/2014.
 */
public class AllOrdersEvent extends ReadEvent{
    @Getter
    private final List<OrderDetails> orderDetails;

    public AllOrdersEvent(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

}
