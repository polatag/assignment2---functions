//Start
//Take input array and Target
//Initialise start = 0 and end = (array size -1)
//Intialise mid variable
//mid = (start+end)/2
//if array[ mid ] == target then return mid
//if array[ mid ] < target then start = mid+1
//if array[ mid ] > target then end = mid-1
//if start<=end then goto step 5
//return -1 as Not element found
//Exit
package com.mycompany.assignmenttwofunarr;

import java.util.Scanner;

public class BinarySearch {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("please enter the number u wanna search from 1->9 ");
        int target = input.nextInt();
        int l = 0;
        int r = arr.length - 1;
        if (binarySearch(arr, l, r, target) >= 0) {
            System.out.println("the number is " + binarySearch(arr, l, r, target));
        } else {
            System.out.println("the number u look for is not found");
        }
    }

    static int binarySearch(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }

        }
        return -1;
    }
}
