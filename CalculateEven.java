//5- Wirte a function CalculateEven that takes array as parameter and calculate
//the sum of even numbers and how many even numbers
package com.mycompany.assignmenttwofunarr;

public class CalculateEven {

    public static void main(String[] args) {
        int arr[] = {8, 2, 5, 4, 3, 5, 10};
        System.out.println("the sum of even numbers :" + calculateEven(arr));
        System.out.println("the number of even number"+evenNumbers(arr));
    }

    static int calculateEven(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    static int evenNumbers(int arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
