package com.trax.core.domain;

import com.trax.core.events.orders.OrderStatusDetails;
import lombok.Getter;

import java.util.Date;

/**
 * Created by SG0220142 on 7/19/2014.
 */
@Getter
public class OrderStatus {

    private Date statusDate;
    private String status;

    public OrderStatus(final Date date, final String status) {
        this.status = status;
        this.statusDate = date;
    }

    public OrderStatusDetails toStatusDetails() {
        //For service requesting order status details
        return new OrderStatusDetails(statusDate, status);
    }

}
