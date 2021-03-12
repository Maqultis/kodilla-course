package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer adam = new Customer("Adam");
        Producer glutenFreeShop = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GrainProduct("Sunflower bread", true), 5);
        productsList.put(new GrainProduct("Rice",true),5);

        orderRequestList.add(new OrderRequest(adam, glutenFreeShop, productsList));

        Customer bartek = new Customer("Bartek");
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList.put(new GrainProduct("Corn", true), 5);

        orderRequestList.add(new OrderRequest(bartek, glutenFreeShop, productsList2));


        return orderRequestList;
    }
    public List<OrderRequest> retrieve2() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer dorota = new Customer("Dorota");
        Producer extraFoodShop = new ExtraFoodShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new Product("Water"), 101);
        productsList.put(new Product("Pork Meat"), 10);
        productsList.put(new GrainProduct("Rice", true), 15);

        orderRequestList.add(new OrderRequest(dorota, extraFoodShop, productsList));

        return orderRequestList;
    }
}
