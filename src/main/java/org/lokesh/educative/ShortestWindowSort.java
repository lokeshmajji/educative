package org.lokesh.educative;

public class ShortestWindowSort {
    public static void main(String[] args) {
        System.out.println(sort(new int[]{1, 2, 5, 3, 7, 10, 9, 12}));
        System.out.println(  sort(new int[]{1, 3, 2, 0, -1, 7, 10}));
        System.out.println(  sort(new int[]{1, 2, 3}));
        System.out.println(  sort(new int[]{3, 2, 1}));

    }
    public static int sort(int[] arr) {
        // TODO: Write your code here
        int left =0, right = arr.length - 1;
        int next = arr.length - 1;
        int prev = 0;
        for(int i=0; i < arr.length; i++){
            int current = arr[i];

            if( i - 1 >= 0)  prev = arr[i - 1];
            if( i + 1 <= arr.length - 1)  next = arr[i + 1];

            if(current >= prev && current <= next ) left++;
            else break;
        }
         prev = arr[0];
         next = arr[arr.length - 1];

        for(int i=arr.length - 1; i >= 0; i--){
            int current = arr[i];

            if( i - 1 >= 0)  prev = arr[i - 1];
            if( i + 1 <= arr.length - 1)  next = arr[i + 1];

            if(current >= prev && current <= next ) right--;
            else break;
        }
        System.out.println("left:" + left);
        System.out.println("right:" + right);

        int subArrayMin = Integer.MAX_VALUE, subArrayMax = Integer.MIN_VALUE;
        for(int i = left; i < right; i++){
            subArrayMin = Math.min(subArrayMin, arr[i]);
            subArrayMax = Math.max(subArrayMax, arr[i]);
        }

        while(left > 0 && arr[left - 1] > subArrayMin) left--;
        while(right < arr.length - 1 && arr[right + 1] < subArrayMax) right++;

        if(left < right) return right - left + 1;
        else if(left == arr.length) return 0;
        else if( left == 0 && right  == arr.length - 1 ) return arr.length;
        return - 1;
    }
}
