package com.example.test;

import java.util.Map;

public class Customer {


    private Map<String, Item> shoppingList;


    public Customer(Map<String, Item> shoppingList) {
        this.shoppingList = shoppingList;
    }

}
