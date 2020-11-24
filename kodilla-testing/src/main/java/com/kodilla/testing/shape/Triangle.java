package com.kodilla.testing.shape;

import java.util.Objects;

class Triangle implements Shape {

    private String name = "Triangle";
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.edgeA, edgeA) == 0 &&
                Double.compare(triangle.edgeB, edgeB) == 0 &&
                Double.compare(triangle.edgeC, edgeC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, edgeA, edgeB, edgeC);
    }


    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return edgeA * edgeB / 2;
    }
}