//3- Write a function getMax that takes array as parameter and returns the max
//value in the array
package com.mycompany.assignmenttwofunarr;

public class Getmax {

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 4, 3};
        System.out.println("the max element in array is :" + maxElement(arr));

    }

    static int maxElement(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
