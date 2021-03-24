package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    void testCalculations() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double addResult = calculator.add(3.3,1.7);
        double subResult = calculator.sub(3.3, 1.7);
        double mulResult = calculator.mul(3.3, 1.7);
        double divResult = calculator.div(15, 5);
        //then
        assertEquals(5, addResult, 0.01);
        assertEquals(1.6, subResult, 0.01);
        assertEquals(5.61, mulResult, 0.01);
        assertEquals(3, divResult, 0.01);

    }
}
