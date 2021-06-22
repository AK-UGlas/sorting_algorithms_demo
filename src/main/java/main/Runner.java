package main;

import sorting.Bubble;
import sorting.Merge;
import sorting.SortFuncs;

import java.util.Arrays;
import java.util.Random;

public class Runner {

    /**
     * Driver Code:
     * Script to demonstrate sorting algorithm time complexity.
     * The sorting algorithms come from the online Udemy.com course Data Structures and Algorithms: Deep Dive using Java
     * https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/
     *
     * @param args - none
     */
    public static void main(String[] args) {

        int[] unsorted = generateRandomArray(10, -5, 25);
        System.out.println(Arrays.toString(unsorted));
        // time how long it takes to sort the array using different sorting algorithms
        timeFunc(new Bubble(), unsorted);
        timeFunc(new Merge(), unsorted);
    }

    /**
     *  helper function to time sorting functions.
     *
     * @param fun - the sorting function to use
     * @param unsortedArray - array to be sorted
     */
    public static void timeFunc(SortFuncs fun, int[] unsortedArray) {
        //confirm the input array is unsorted
        System.out.println("is input array sorted? " + SortFuncs.isSorted(unsortedArray));

        // create a copy of the unsorted array - required if we want to precisely compare performance between algorithms
        // using the same array of numbers
        int[] arrCopy = new int[unsortedArray.length];
        System.arraycopy(unsortedArray, 0, arrCopy, 0, unsortedArray.length);

        long start = System.nanoTime();
        fun.sort(arrCopy);
        double elapsed = (double)(System.nanoTime() - start) / 1000000; // elapsed time in ms
        if (SortFuncs.isSorted(arrCopy)) {
            System.out.println(fun.getName() + "Sort took " + elapsed + " ms for array of length " + unsortedArray.length);
        } else {
            System.out.println("Error: Array is not sorted, check implementation of " + fun.getName());
        }
    }

    /**
     * Helper Method: Generate a random int array of a certain
     * length where values lie between specific max and min values;
     * @param length - the length of the array to create
     * @param min - minimum possible value
     * @param max - maximum possible value
     */
    public static int[] generateRandomArray(int length, int min, int max) {
        Random rand = new Random();
        int range = max - min;
        int[] randArray = new int[length];

        for (int i = 0; i < length; i++) {
            randArray[i] = rand.nextInt(range) + min;
        }

        return randArray;
    }
}
