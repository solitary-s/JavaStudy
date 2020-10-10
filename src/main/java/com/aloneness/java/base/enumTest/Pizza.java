package com.aloneness.java.base.enumTest;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {

    private PizzaStatus status;

    public enum PizzaStatus {
        ORDERED(5) {
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY(2) {
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED(0) {
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        public boolean isOrdered() {
            return false;
        }

        public boolean isReady() {
            return false;
        }

        public boolean isDelivered() {
            return false;
        }

        private int timeToDelivered;

        PizzaStatus(int timeToDelivered) {
            this.timeToDelivered = timeToDelivered;
        }

        public int getTimeToDelivered() {
            return timeToDelivered;
        }
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "status=" + status +
                '}';
    }

    public boolean isDelivered() {
        return this.status.isReady();
    }
}
