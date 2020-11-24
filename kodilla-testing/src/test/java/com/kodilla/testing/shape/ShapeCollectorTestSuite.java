package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing")
    class TestAddAndRemove {

        @DisplayName("Test for adding figure to array list")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(2);
            //When
            shapeCollector.addFigure(shape);

            //Then
            assertEquals(1, shapeCollector.getFigures().size());
        }

        @DisplayName("Test for adding figure to array list")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(2, 3, 4);
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getFigures().size());
        }

        @DisplayName("Test for removing figure from array list")
        @Test
        void testRemoveFigureWhichNotExist() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(2);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests for getting")
    class TestGet {

        @DisplayName("Test for getting figure from array list")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(2);
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(shape, retrievedShape);
        }

        @DisplayName("Test for getting figure from empty array list")
        @Test
        void testGetFigureWhichNotExist() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertNull(retrievedShape);
        }

        @DisplayName("Test for show array list")
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(2);
            shapeCollector.addFigure(shape);
            List<Shape> shapesList = new ArrayList<>();
            shapesList.add(shape);
            //When
            String shapeResultList = shapeCollector.showFigures();

            //Then
            assertEquals(shapesList.toString(), shapeResultList);
        }
    }
}




