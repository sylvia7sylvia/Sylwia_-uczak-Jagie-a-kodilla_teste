package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("6"));

        try {
            System.out.println(warehouse.getOrder("7").getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Przepraszamy, ale to zamówienie nie istnieje");
        } finally {
            System.out.println("Dziękujemy za używanie naszej aplikacji!");
        }
    }
}
