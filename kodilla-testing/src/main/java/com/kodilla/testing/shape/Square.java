package com.kodilla.testing.shape;

import java.util.Objects;

class Square implements Shape {

    private String name = "Square";
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.edge, edge) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, edge);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return edge * 2;
    }
}