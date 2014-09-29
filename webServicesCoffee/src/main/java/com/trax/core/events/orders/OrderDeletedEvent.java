package com.trax.core.events.orders;

import com.trax.core.events.DeletedEvent;
import lombok.Getter;

import java.util.UUID;

/**
 * Created by SG0220142 on 7/20/2014.
 */
public class OrderDeletedEvent extends DeletedEvent {
    @Getter
    private UUID key;
    @Getter
    private OrderDetails details;
    private boolean deletionCompleted;

    public OrderDeletedEvent(UUID key) {
        this.key = key;
    }

    public OrderDeletedEvent(UUID key, OrderDetails details) {
        this.key = key;
        this.details = details;
    }

    public boolean isDeletionCompleted() {
        return deletionCompleted;
    }

    public static OrderDeletedEvent deletionForbidden(UUID key, OrderDetails details) {
        OrderDeletedEvent ev = new OrderDeletedEvent(key, details);
        ev.entityFound = true;
        ev.deletionCompleted = false;
        return ev;
    }

    public static OrderDeletedEvent notFound(UUID key) {
        OrderDeletedEvent ev = new OrderDeletedEvent(key);
        ev.entityFound = false;
        return ev;
    }


}
