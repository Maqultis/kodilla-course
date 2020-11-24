package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    public List<Shape> getFigures() {
        return figures;
    }



    void addFigure (Shape shape) {
        figures.add(shape);
    }

    boolean removeFigure (Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape theShape = null;
        if (n >= 0 && n < figures.size()) {
            theShape = figures.get(n);
        }
        return theShape;
    }

    String showFigures() {
        return figures.toString();
    }
}
