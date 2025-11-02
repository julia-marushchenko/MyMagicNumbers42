 /**
 * Java program to find numbers dividable by 3.
 */

 package com.numbers;

 import java.util.ArrayList;
 import java.util.List;

 /**
 * Main class.
 */
public class Main {

    // Main class to run java program
    public static void main(String[] args) {

        // Creating list of numbers
        List<Integer> list = new ArrayList<>();

        // Adding numbers to a list of size 27
        for (int integer = 0; integer < 27; integer++) {

            list.add(integer);

        }

        // Checking numbers of a list if they are dividable by 3
        for (int integer = 0; integer < 27; integer++) {

            if (list.get(integer) % 3 == 0) {

                // Printing result to console
                System.out.println(list.get(integer) + " is dividable by 3.");

            } else {

                // Printing result to console
                System.out.println(list.get(integer) + " is not dividable by 3.");

            }
        }
    }
}