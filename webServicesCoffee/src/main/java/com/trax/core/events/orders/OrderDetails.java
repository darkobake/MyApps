package com.trax.core.events.orders;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Created by SG0220142 on 7/19/2014.
 */

public class OrderDetails {
    @Getter@Setter
    private UUID key;
    @Getter@Setter
    private Date dateTimeOfSubmission;
    @Getter
    private Map<String, Integer> orderItems;

    public OrderDetails() {
        key = null;
    }

    public OrderDetails(UUID key) {
        this.key = key;
    }

    public void setOrderItems(Map<String, Integer> orderItems) {
        if (orderItems == null) {
            this.orderItems = Collections.emptyMap();
        } else {
            this.orderItems = Collections.unmodifiableMap(orderItems);
        }
    }




}
