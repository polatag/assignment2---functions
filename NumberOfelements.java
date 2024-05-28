//2- Write a function getNumOfElements that takes array as parameter and
//returns the number of its elements
package com.mycompany.assignmenttwofunarr;

public class NumberOfelements {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("the number of elements is:" + numberOfele(arr));

    }

    static int numberOfele(int array[]) {

        return array.length;
    }
}
