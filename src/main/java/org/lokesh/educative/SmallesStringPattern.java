package org.lokesh.educative;

import java.util.*;

public class SmallesStringPattern {
    public static void main(String[] args) {

    }
    public static String findSubstring(String str, String pattern) {
        // TODO: Write your code here
        int windowStart =0, minLength = Integer.MAX_VALUE;
        Map<Character,Integer> patternMap = new HashMap<>();

        for(char c: pattern.toCharArray()) patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        for(int windowEnd =0; windowEnd < str.length(); windowEnd++){
            Character rightCar = str.charAt(windowEnd);
            if(patternMap.containsKey(rightCar)){

            }
        }
//        str.sub
        return "";
    }
}
