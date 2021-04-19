package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy list", "bread", 2);
            case PAINTING:
                return new PaintingTask("Painting task", "red", "bike");
            case DRIVING:
                return new DrivingTask("Driving task", "wroclaw", "car");
            default:
                return null;
        }
    }
}
