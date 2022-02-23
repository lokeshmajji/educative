package org.lokesh.educative;

import java.util.*;

public class TripletsWithSmallerSum {

    public static void main(String[] args) {
        searchTriplets(new int[] {-1, 0, 2, 3}, 3);
        searchTriplets(new int[]{-1, 4, 2, 1, 3},5);
    }
    public static int searchTriplets(int[] arr, int target) {
        int count = -1;

        // TODO: Write your code here
        Arrays.sort(arr);
        //[-1, 0, 2, 3]
        // [-1, 1, 2, 3, 4], 5

        for(int i=0; i< arr.length; i++){
            int left = i+1;
            int right = arr.length - 1;
            int temp = right;
            while(left < right){
                System.out.println("i=" + i + " [" + arr[i] + "," + arr[left] + "," + arr[right] + "]");
                int currentSum = arr[i] + arr[left] + arr[right];
                if(currentSum < target)   {
                    System.out.println("right correct [" + arr[i] + "," + arr[left] + "," + arr[right] + "]");
                    count++;
                }
                right--;

            }
        }
        System.out.println(count+1);
        return count;
    }
}
