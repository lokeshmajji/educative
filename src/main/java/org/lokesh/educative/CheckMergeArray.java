package org.lokesh.educative;

import java.util.*;
public class CheckMergeArray
{
    public static void main(String[] args) {
        mergeArrays(new int[]{1, 3, 4, 5} ,new int[]{2, 6, 7, 8});
    }
    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        // write your code here
        int[] arr3 = new int[arr1.length + arr2.length];

        // identify which is big array
        int maxLengthArray = arr1.length > arr2.length ? arr1.length : arr2.length;

        int i =0;
        int j = 0;
        int k =0;
        while(k < arr3.length ) {
            if(i < arr1.length && arr1[i] < arr2[j]){
                arr3[k++] = arr1[i];
                i++;
                System.out.println( "i=" + i );
            } else {
                arr3[k++] = arr2[j];
                j++;
                System.out.println( "j=" + j);
            }
            System.out.println(Arrays.toString(arr3));

        }


        return arr3; // make a new resultant array and return your results in that
    }
}
//arr1 = {1, 3, 4, 5}
//arr2 = {2, 6, 7, 8}
