package com.trax.core.domain;

import java.util.Set;

/**
 * Created by SG0220142 on 7/19/2014.
 */
public class OrderStatusHistory {
    private final Set<OrderStatus> orderStatuses;
    public OrderStatusHistory(final Set<OrderStatus> orderStatuses) {
        this.orderStatuses = orderStatuses;
    }
    public void addStatus(final OrderStatus orderStatus) {
        this.orderStatuses.add(orderStatus);
    }

}
