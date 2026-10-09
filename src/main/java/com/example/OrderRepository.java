package com.example;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private final Map<String, Double> db = new HashMap<>();

    public boolean save(String orderId, double amount) {
        if (amount <= 0) return false;
        db.put(orderId, amount);
        return true;
    }

    public Double findById(String orderId) {
        return db.get(orderId);
    }
}