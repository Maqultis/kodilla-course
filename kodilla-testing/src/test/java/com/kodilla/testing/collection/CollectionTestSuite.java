package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {


    @BeforeEach
    public void before() {
        System.out.println("Exterminate odd numbers, even numbers: ");
    }
    @AfterEach
    public void after() {
        System.out.println("Odd numbers exterminated.");
    }
    @DisplayName("When create empty list, " +
                "then evenList should be empty."
                )
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(numbers, result);
        System.out.println(result);
    }

    @DisplayName("When create normalList, " +
                "then evenList should return even numbers."
                )
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(5, 15, 24, 8, 33, 2, 7, 12);
        List<Integer> evenNumbers = Arrays.asList(24, 8, 2, 12);

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(evenNumbers, result);
        System.out.println(result);
    }
}
