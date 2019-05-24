package com.axp.petshop;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Petshop {

    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItemsInStock() {
        return Collections.unmodifiableList(items);
    }
}
