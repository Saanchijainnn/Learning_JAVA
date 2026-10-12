package com.ok.learningjava.datatypes;

import java.util.Scanner;

class ArrayOperations {   //creates a class named array operations

    public static void main(String[] args) { // starting point

        Scanner sc = new Scanner(System.in);  // Scanner → tool for taking input
                                               // sc      → name of that tool

        // Input number of elements
        System.out.print("Enter number of elements (N): ");
        int n = sc.nextInt(); // take an integer from the user

        // Create array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Searching - Linear Search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int position = -1;  // this means we haven't found the index yet

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i;
                break;    // stop the loop becuse we found it
            }
        }

        if (position != -1) {
            System.out.println(key + " found at index " + position);
        } else {
            System.out.println(key + " not found in the array");
        }

        // 2. Sorting - Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;   // we use temp so that we dont loose it
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted array: ");

        for (int x : arr) {   //Take every element from arr, one by one, and temporarily call it x.
            System.out.print(x + " ");
        }

        // 3. Statistical Operations
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int x : arr) {

            sum += x;

            if (x > max) {
                max = x;
            }

            if (x < min) {
                min = x;
            }
        }

        double average = (double) sum / n;

        System.out.println("\nSum     = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        sc.close();
    }
}