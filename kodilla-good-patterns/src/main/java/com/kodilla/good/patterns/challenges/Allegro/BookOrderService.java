package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class BookOrderService implements ProductOrderService{

    public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        System.out.println("Creating order for: " + user.getRealName() + " for: " + product);
        return true;
    }
}
