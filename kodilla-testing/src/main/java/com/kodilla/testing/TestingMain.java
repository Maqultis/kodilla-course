package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();

        int a = 12;
        int b = 3;
        int resultAdd = calc.add(a, b);


        if (resultAdd==15) {
            System.out.println("The result of adding " + a + " to " + b + " is " + resultAdd
                    +"\n Test of add method is OK");
        }
        else {
            System.out.println("Error!");
        }

        int resultSubtract = calc.subtract(a, b);

        if (resultSubtract==9) {
            System.out.println("The result of subtracting " + b + " from " + a + " is " +
                    resultSubtract + "\n Test of add method is OK");
        }
        else {
            System.out.println("Error!");
        }
    }
}
