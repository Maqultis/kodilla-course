package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class BookOrderRepository implements ProductOrderRepository {

    @Override
    public boolean orderProduct(User user, LocalDateTime orderDate, Product product, int quantity) {
        return true;
    }
}
