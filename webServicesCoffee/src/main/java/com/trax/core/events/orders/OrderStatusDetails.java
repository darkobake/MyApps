package com.trax.core.events.orders;

import lombok.Getter;

import java.util.Date;

/**
 * Created by SG0220142 on 7/19/2014.
 */
public class OrderStatusDetails {
    @Getter
    private Date statusDate;
    private String status;

    public OrderStatusDetails(Date statusDate, String status) {
            this.statusDate = statusDate;
            this.status =status;
    }


}
