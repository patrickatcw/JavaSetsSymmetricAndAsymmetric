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

    }

}
