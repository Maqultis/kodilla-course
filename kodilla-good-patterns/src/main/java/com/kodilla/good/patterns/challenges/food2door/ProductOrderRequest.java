package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class ProductOrderRequest {

    private Customer customer;
    private Producer producer;
    private Map<Product, Integer> productOrderRequest;

    public ProductOrderRequest(Customer customer, Producer producer, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.producer = producer;
        this.productOrderRequest = productOrderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}
