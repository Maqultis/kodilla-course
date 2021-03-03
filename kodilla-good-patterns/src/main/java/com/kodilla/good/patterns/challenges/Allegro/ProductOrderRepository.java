package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface ProductOrderRepository {

    boolean orderProduct(User user, LocalDateTime orderDate, Product product, int quantity);
}
