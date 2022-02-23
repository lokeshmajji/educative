package org.lokesh.educative;

public class BackspaceCompare {
    public static void main(String[] args) {
//        System.out.println(compare("xy#z","xzz#"));
//        System.out.println(compare("xy#z","xyz#"));
//        System.out.println(compare("xp#","xyz##"));
//        System.out.println(compare("xywrrmp","xywrrmu#p"));

        System.out.println(compare2("xy#z","xzz#"));
        System.out.println(compare2("xy#z","xyz#"));
        System.out.println(compare2("xp#","xyz##"));
        System.out.println(compare2("xywrrmp","xywrrmu#p"));

    }
    public static boolean compare(String str1, String str2) {
        // TODO: Write your code here
        return helper1(str1).equals(helper1(str2));
    }
    public static boolean compare2(String str1, String str2) {
        // TODO: Write your code here
        int p1 = str1.length() - 1, p2 = str2.length() - 1;
        while(p1 >=0 && p2 >=0 ){
            int p1reps = 0, p2reps = 0;
            while(str1.charAt(p1) == '#') {
                p1 = p1 -1;
                p1reps++;
            }
            p1 = p1 - p1reps;

            while(str2.charAt(p2) == '#') {
                p2 = p2 - 1;
                p2reps++;
            }
            p2 = p2 - p2reps;

            if(str1.charAt(p1) == str2.charAt(p2)) {
                p1--;
                p2--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static String helper1(String str){
        StringBuilder sb1 = new StringBuilder();
        for(int i =0 ; i < str.length(); i++){
            sb1.append(str.charAt(i));
            if(str.charAt(i) == '#'){
//                System.out.println("i="+i);
                if(i-1 >=0) {
//                    System.out.println("sb:"+sb1.length());
                    sb1.deleteCharAt(sb1.length()-1);
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }
        }
        System.out.println("final string:"+sb1.toString());
        return sb1.toString();
    }

}
