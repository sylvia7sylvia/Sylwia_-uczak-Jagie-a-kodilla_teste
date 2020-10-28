package com.kodilla.collections.arrays;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class ListDemoTest {

    @Test
    public void testCreateList() {
        ListDemo listDemo = new ListDemo();
        List<String> list = listDemo.createList();
        assertEquals("Jakis napis", list.get(0));

    }
}
