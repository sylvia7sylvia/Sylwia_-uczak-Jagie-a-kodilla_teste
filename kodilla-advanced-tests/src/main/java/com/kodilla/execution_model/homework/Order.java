package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String clientLogin;

    public Order(double orderValue, LocalDate orderDate, String clientLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.clientLogin = clientLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getClientLogin() {
        return clientLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderValue == order.orderValue &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(clientLogin, order.clientLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, clientLogin);
    }

    @Override
    public String toString() {
        return "Order: " + "kwota zamówienia= " + orderValue +
                ", data zamówienia= " + orderDate + ", login= " + clientLogin;
    }
}
