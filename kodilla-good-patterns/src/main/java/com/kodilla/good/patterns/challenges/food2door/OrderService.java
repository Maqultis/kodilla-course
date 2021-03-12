package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderService {

    public void processOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("Processing your order " + n.getCustomer().getName());
                    return n.getProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Order finished " + t + "\n"));
    }
}
