//7- Modify the above function to be CountGeneral that takes array as
//parameter and count occurrences of every number in the array and print it
//Ex. Input [1,2,3,1,3,6] output
package com.mycompany.assignmenttwofunarr;

public class CountGeneral {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 3, 6};

        countGeneral(arr);
    }

    static void countGeneral(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int occurrences = 1;
            boolean alreadyCounted = false;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    occurrences++;
                    alreadyCounted = true;
                }

            }
            //Or I can use a third loop to check before the print, if this number is already been counted
            if (alreadyCounted) {
                System.out.println("the occurrences of element :" + arr[i] + " is " + occurrences);
            } else {
                System.out.println("this number is already counted or is only exist for once " + arr[i]);
            }

        }

    }
}
