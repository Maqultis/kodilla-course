package com.kodilla.good.patterns.challenges.food2door;

public class GrainProduct extends Product {
    boolean isGlutenFree;

    public GrainProduct(String productName, boolean isGlutenFree) {
        super(productName);
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GrainProduct that = (GrainProduct) o;
        return isGlutenFree == that.isGlutenFree;
    }
}
