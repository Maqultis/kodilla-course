package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve () {
        User user = new User("Johny", "Jan Janek");
        LocalDateTime orderDate = LocalDateTime.of(2021, 03, 02, 15, 15);
        Product product = new Book("The Lord of the Rings", "fantasy", 35);
        int quantity = 1;

        System.out.println("Retrieve product request: ");
        System.out.println("User: " + user.getUsername() + " Date: " + orderDate + "\n" + product
                + ", quantity: " + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}
