package org.lokesh.educative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSumToTarget {
    public static void main(String[] args) {
        searchQuadruplets(new int[] {4, 1, 2, -1, 1, -3}, 1);
    }
    public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        // TODO: Write your code here

        //sort the array first
        Arrays.sort(arr);

        for(int i=0; i < arr.length -3; i++){
            //make sure you are passing the indexes rather than the values
            // for some of the problems
            helper(arr,target - arr[i] - arr[i+1], i, i+1, i+2,quadruplets);
            for(int j = i +1; j < arr.length - 2; j++) {

            }
        }
        System.out.println(quadruplets);
        return quadruplets;
    }

    public static void helper(int[] arr, int targetSum, int x, int w,int left, List<List<Integer>> quadruplets){
           int right = arr.length - 1;
            while(left < right){
                int currentSum = arr[left] + arr[right];
                if(targetSum == currentSum){
                    System.out.println("Sum");
                    quadruplets.add(Arrays.asList(arr[left], arr[right], arr[x], arr[w]));
                    left++;
                    right--;
                } else if(targetSum > currentSum) {
                    right--;
                } else {
                    left++;
                }
            }
    }
}
