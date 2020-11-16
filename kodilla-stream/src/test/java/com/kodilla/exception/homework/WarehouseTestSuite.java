package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)

    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("13");
        //when
        Order result = warehouse.getOrder(order.getNumber());
        //then
        assertEquals(order, result);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testDoesOrderExists_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("5");
        //when
        warehouse.getOrder(order.getNumber());
    }
}
