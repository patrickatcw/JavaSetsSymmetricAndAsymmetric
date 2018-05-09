package com.me;

import java.util.HashSet;
import java.util.Set;

//https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html
//http://www.java2s.com/Code/Java/Collections-Data-Structure/Setoperationsunionintersectiondifferencesymmetricdifferenceissubsetissuperset.htm
public class Main {


    public static void main(String[] args) {

        //step 1 create 2 sets of variables
        Set<Integer> squares = new HashSet<Integer>();
        Set<Integer> cubes = new HashSet<Integer>();

        //step 2 now create values for both with for loop
        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);

        }

        //step 3 check for what we have with .size
        System.out.println("There are " + squares.size() + " squares" +
                " and " + cubes.size() + " cubes");
        //step 4 now run....
        /*results;
        There are 100 squares and 100 cubes
         */

        System.out.println("------------------------------------------------");
        System.out.println("just printing the size of the result......");

        //step 5 let's just print the size of the result to confirm
        // things are working
        Set<Integer> union = new HashSet<Integer>(squares); //new hashset variable
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        //step 6 now run....
        /*results;
        There are 100 squares and 100 cubes
        Union contains 196 elements.
         */

        System.out.println("------------------------------------------------");
        System.out.println("now we are getting the intersection......");

        //step 7 get the intersection
        Set<Integer> intersection = new HashSet<Integer>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) +
                    " and the cube of " + Math.cbrt(i));

            //step 8 then run....
            /*results;
            There are 100 squares and 100 cubes
            Union contains 196 elements.
            Intersection contains 4 elements.
            4096 is the square of 64.0 and the cube of 16.0
            1 is the square of 1.0 and the cube of 1.0
            64 is the square of 8.0 and the cube of 4.0
            729 is the square of 27.0 and the cube of 9.0
             */
        }

    }

}
