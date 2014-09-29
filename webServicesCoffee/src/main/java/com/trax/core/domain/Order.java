package com.trax.core.domain;

import com.trax.core.events.orders.OrderDetails;
import org.springframework.beans.BeanUtils;

import java.util.*;

/**
 * Created by SG0220142 on 7/19/2014.
 */
public class Order {
    private final Date dateTimeOfSubmission;
    private Map<String, Integer> orderItems;
    private final UUID key;
    private Customer customer;

    private OrderStatus status;
    private List<OrderStatus> statusHistory;

    public Order(final Date dateTimeOfSubmission) {
        this.key = UUID.randomUUID(); //unique ID to the order
        this.dateTimeOfSubmission = dateTimeOfSubmission;
        statusHistory = new ArrayList<OrderStatus>();
    }

    public void addStatus(OrderStatus newStatus) {
        statusHistory.add(newStatus);
        status = newStatus; //assign latest status to order
    }

    //return latest state of the order
    public OrderStatus getStatus() {
        return status;
    }

    public Date getDateTimeOfSubmission() {
        return dateTimeOfSubmission;
    }

    public UUID getKey() {
        return key;
    }

    public void setOrderItems(Map<String, Integer> orderItems) {
        if (orderItems == null) {
            this.orderItems = Collections.emptyMap();
        } else {
            this.orderItems = Collections.unmodifiableMap(orderItems);

        }
    }

    public Map<String, Integer> getOrderItems() { //will return the unmodifiable view of order items
        return orderItems;
    }

    public boolean canBeDeleted() {
        return true;
    }

    /*
    FOR SERVICES RELATING TO ORDER
     */

    public OrderDetails toOrderDetails() {

        OrderDetails details = new OrderDetails();
        //spirng
        BeanUtils.copyProperties(this, details);

        return details;
    }

    public static Order fromOrderDetails(OrderDetails orderDetails) {
        Order order = new Order(orderDetails.getDateTimeOfSubmission());

        BeanUtils.copyProperties(orderDetails, order);

        return order;

    }


}
