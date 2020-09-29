package com.aloneness.java.base.enumTest;

import java.util.EnumSet;
import java.util.List;

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

    public boolean isDelivered() {
        return this.status.isReady();
    }

    public static void main(String[] args) {
        EnumSet<PizzaStatus> enumSet = EnumSet.of(PizzaStatus.READY, PizzaStatus.ORDERED);
    }
}
