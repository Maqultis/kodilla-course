package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException()  {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(SecondChallengeException.class, () ->
                        secondChallenge.probablyIWillThrowException(0.99, 2)),
                () -> assertThrows(SecondChallengeException.class, () ->
                        secondChallenge.probablyIWillThrowException(2, 2)),
                () -> assertThrows(SecondChallengeException.class, () ->
                        secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.49))
        );
    }
}
