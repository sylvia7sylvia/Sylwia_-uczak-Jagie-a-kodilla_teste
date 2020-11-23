package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();                //zmienne dodajemy ra dla kazdego testu - czyli nasze given
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoice() {
        //When
        int numberOfItems = invoice.getSize();
        //Then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        //When
        Item result = invoice.getItem(2);
        //Then
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //When
        Item result = invoice.getItem(-3);
        //Then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //When
        Item result = invoice.getItem(7);
        //Then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //When
        invoice.clear();
        //Then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach                         //inicjalizacja faktury przed kazdym testem
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach                          //po kazdym tescie zerowanie zmiennych
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll                          //przed wszystkimi testami komunikat "Starting testing"
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll                           //po wszystkich testach kominikat "Finishing testing"
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}