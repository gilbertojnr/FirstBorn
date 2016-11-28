package com.company;

/**
 * Created by gilbertakpan on 11/21/16.
 */
public class FizzBuzz {

    public static void main(String args[]) {
//        iterate from 0 to 100
        for (int i = 0; i <= 100; i++) {
//            if the number can be divided by 3 and 5 evenly print out com.company.FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("com.company.FizzBuzz");
            }

//        if the number can be divided by 3 evenly print out "Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
//        if the number can be divided by 5 evenly print out "Buzz"
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
//

        }
    }
}