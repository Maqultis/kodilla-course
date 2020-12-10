package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers [] = { 2, 4, 4 , 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7 };
        double averageExpected = 5.85;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(averageExpected, average, 0.0001);


    }
}
