package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GlutenFreeShop implements Producer {

    private final Map<Product, Integer> productsList;

    public GlutenFreeShop() {
        productsList = createProductsList();
    }

    private Map<Product, Integer> createProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GrainProduct("Sunflower bread", true), 35);
        productsList.put(new GrainProduct("Rice", true), 100);
        productsList.put(new GrainProduct("Corn", true), 70);

        return productsList;
    }



    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        if (productsOrders.size() < 2) {
            System.out.println("Please order at least 2 products");
            return false;
        }
        return isProductAvailable(productsOrders);
    }

    private boolean isProductAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Gluten free shop: Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}
