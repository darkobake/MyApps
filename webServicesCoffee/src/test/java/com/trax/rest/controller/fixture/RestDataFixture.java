package com.trax.rest.controller.fixture;

import com.trax.core.events.orders.AllOrdersEvent;
import com.trax.core.events.orders.OrderDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Created by SG0220142 on 7/20/2014.
 */
public class RestDataFixture {

    public static final String YUMMY_ITEM = "yummy1";

    public static AllOrdersEvent allOrders(){

        List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
        orderDetails.add(standardOrderDetails());
        orderDetails.add(standardOrderDetails());
        orderDetails.add(standardOrderDetails());

        return new AllOrdersEvent(orderDetails);
    }

    public static OrderDetails standardOrderDetails() {
        //return null;
        return customKeyOrderDetails(UUID.randomUUID());
    }

    public static OrderDetails customKeyOrderDetails(UUID uuid) {
        OrderDetails orderDetails = new OrderDetails(uuid);
        orderDetails.setOrderItems(Collections.singletonMap(YUMMY_ITEM,12));
        return orderDetails;
    }

    public static String standardOrderJSON() {
        return "{ \"items\": { \"yummy1\": 12, \"yummy15\": 42 } }";
    }


}
