//4- Write a function getMin that takes array as parameter and returns the min
//value in the array
package com.mycompany.assignmenttwofunarr;

public class getMin {

    public static void main(String[] args) {
        int arr[] = {8, 2, 5, 4, 3};
        System.out.println("the min element in array is :" + minElement(arr));

    }

    static int minElement(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
