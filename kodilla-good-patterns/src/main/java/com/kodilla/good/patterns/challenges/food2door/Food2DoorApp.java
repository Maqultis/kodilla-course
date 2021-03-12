package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorApp {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        orderService.processOrders(new OrderRetriever().retrieve());
        orderService.processOrders(new OrderRetriever().retrieve2());
    }
}
