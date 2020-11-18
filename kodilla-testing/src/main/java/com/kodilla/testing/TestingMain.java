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

        Calculator calc = new Calculator(12, 3);
        calc.add(12, 3);

        if (calc.getAddResult()==(15)) {
            System.out.println("The result of adding " + calc.getA() + " to " + calc.getB() + " is " + calc.getAddResult()
                    +"\n Test of add method is OK");
        }
        else {
            System.out.println("Error!");
        }

        calc.subtract(12, 3);
        
        if (calc.getSubtractResult()==(9)) {
            System.out.println("The result of subtracting " + calc.getB() + " from " + calc.getA() + " is " +
                    calc.getSubtractResult() + "\n Test of add method is OK");
        }
        else {
            System.out.println("Error!");
        }
    }
}
