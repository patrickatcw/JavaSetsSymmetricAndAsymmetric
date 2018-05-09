package com.me;

import java.util.Arrays;
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

        System.out.println("--------------------------------------------");
        System.out.println("calculating the asymmetric difference....");

        //step 9 calculate the asymmetric difference
        Set<String> words = new HashSet<String>(); //empty constructor
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);

            //step 10 then run
            /*results;
            the
            in
            year
            one
            of
            day
            fox
             */
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("demonstrating asymmetric difference, showing word difference");

        //step 11 new stuff for demo on asymmetric differences
        Set<String> nature = new HashSet<String>(); //empty constructor
        Set<String> divine = new HashSet<String>(); //empty constructor
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));  //calling the java asList method

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));  //calling the java asList method

        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<String>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature:");
        Set<String> diff2 = new HashSet<String>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        /*results; by running in step 13
            nature - divine:
            all but art thee nature unknown
            divine - nature:
            err forgive divine human
             */
        System.out.println("-----------------------------------------");
        System.out.println("symmetric difference is removing the intersection from the union");

        //step 14 get the symmetric difference
        Set<String> unionTest = new HashSet<String>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<String>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        //step 15 run
        /*results;
        symmetric difference is removing the intersection from the union
        Symmetric difference
	    all but art thee err nature forgive divine human unknown
         */

        System.out.println("**************************************************");
        System.out.println("contains all is used to test if one set is a superset " +
                "of another, only testing membership, non-destructive, does not modify" +
                "the sets");
        //step 16 the last bulk operation, contains all
        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }
        if(nature.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of nature");
        }
        if(divine.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of divine");
        }

        //step 17 run
        /*result;
        intersection is a subset of nature
        intersection is a subset of divine
         */

    }

    //step 12 printSet method
    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
        //step 13 run

    }

}
