//6- Write a function count2 that takes array as parameter and counts
//occurrences of number 2
package com.mycompany.assignmenttwofunarr;

public class CountTwo {

    public static void main(String[] args) {
        int arr[] = {8, 2, 5, 2, 3, 8, 10};
        System.out.println("the occurrences of number 2 are :" + countTwo(arr));

    }

    static int countTwo(int arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                cnt++;
            }
        }
        return cnt;
    }
}
