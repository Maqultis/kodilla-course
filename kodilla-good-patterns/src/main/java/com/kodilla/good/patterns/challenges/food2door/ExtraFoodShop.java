package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements Producer {

    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductsList();
    }
    private Map<Product, Integer> createProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new Product("Pork Meat"), 50);
        productsList.put(new GrainProduct("Rice",true), 76);
        productsList.put(new GrainProduct("Bread", false), 45);
        productsList.put(new Product("Water"), 100);

        return productsList;
    }

    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry: productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop: Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}
