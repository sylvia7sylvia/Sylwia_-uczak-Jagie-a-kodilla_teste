package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopTestSuite {

    Shop shop = new Shop();
    Order order01 = new Order(1234.56, LocalDate.of(2018, 12, 23), "sylwia");
    Order order02 = new Order(13.5, LocalDate.of(2018, 5, 16), "dawid");
    Order order03 = new Order(1149.99, LocalDate.of(2020, 6, 15), "ania");
    Order order04 = new Order(110.90, LocalDate.of(2019, 6, 13), "karolina");
    Order order05 = new Order(1.10, LocalDate.of(2020, 4, 2), "natalia");

    @Test
    public void shouldAddOrdersToShop() {
        //When
        int numberOfOrders = shop.getOrdersSize();
        //Then
        assertEquals(5, numberOfOrders);
    }

    @Test
    public void shouldReturnEmptyListIfDatesOutOfRange() {
        //When
        List<Order> emptyList = shop.getOrdersFromToDate
                (LocalDate.of(2016, 1, 1),
                        LocalDate.of(2017, 12, 31));
        //Then
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldGetOrdersInValueRange() {
        //When
        List<Order> orders = shop.getOrdersInValueRange(50, 150);
        //Then
        assertEquals(1, orders.size());
    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersInValueRange() {
        //When
        List<Order> emptyList = shop.getOrdersInValueRange(50, 100);
        //Then
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldGetOrdersTotalValue() {
        //When
        shop.getOrdersTotalValue();
        //Then
        assertEquals(2510.05, shop.getOrdersTotalValue(), 0.01);
    }

    @Test
    public void shouldGetExistingOrder() {
        //When
        Order result = shop.getOrder(0);
        //Then
        assertEquals("sylwia", result.getClientLogin());
        assertEquals(1234.56, result.getOrderValue());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Zerowanie ustawień...");
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order01);
        shop.addOrder(order02);
        shop.addOrder(order03);
        shop.addOrder(order04);
        shop.addOrder(order05);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Rozpoczęcie testowania");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Zakończenie testowania! Sprawdz rezultaty :)");
    }

}