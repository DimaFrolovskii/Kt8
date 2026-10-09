package com.example;

public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public boolean createOrder(String orderId, double amount) {
        if (orderId == null || orderId.isEmpty()) {
            return false;
        }
        return repository.save(orderId, amount);
    }
}