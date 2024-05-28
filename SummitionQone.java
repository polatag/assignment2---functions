//1- Write a function getSummition that takes array as parameter and returns
//summation of its elements
package com.mycompany.assignmenttwofunarr;

public class SummitionQone {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("the sum of array element is :"+summitionE(arr) );

    }

   static int summitionE(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
