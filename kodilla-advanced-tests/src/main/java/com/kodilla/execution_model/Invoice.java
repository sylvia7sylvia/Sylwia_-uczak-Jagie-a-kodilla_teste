package com.kodilla.execution_model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {                //dodanie nowej pozycji do faktury
        this.items.add(item);
    }

    public Item getItem(int index) {
        if (index >= 0 && index < items.size()) {   //pobranie pozycji z faktury, jeśli przekazany indeks jest prawidłowy
            return this.items.get(index);
        }
        return null;
    }

    public void clear() {                           //usunięcie wszystkich pozycji z faktury
        this.items.clear();
    }

    public int getSize() {                          //zwrócenie liczby pozycji na fakturze
        return this.items.size();
    }
}
