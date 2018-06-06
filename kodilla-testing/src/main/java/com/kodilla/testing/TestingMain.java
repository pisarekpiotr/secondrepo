package com.kodilla.testing;

import com.kodilla.testing.SimpleUser;
import com.kodilla.testing.Calculator1;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //Poniżej mój kolejny test -->

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator1 firstCalculator = new Calculator1();
        int result2 = firstCalculator.add (1,2);
        int result3 = firstCalculator.substract(1,2);

        System.out.println();
        System.out.println("A + B = 4 ");
        if (result2 == 4 ) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("A + B = "  + result2);

        System.out.println();
        System.out.println("A - B = 4 ");
        if (result3 == 4 ) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("A - B = "  + result3);
      }
    }

