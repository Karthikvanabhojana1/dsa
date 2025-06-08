package org.example;

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {

        // two pointer approach i and j
        char sh[]=s.toCharArray();
        char th[]=t.toCharArray();
        int i=0;
        int j=0;
        while(i<sh.length && j<th.length){
            if(sh[i]==th[j]){
                i++;
                j++;
            }else{
                j++;
            }

        }
        if(i==sh.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "acb", t = "ahbgdc";

        System.out.println(isSubsequence(s,t));
    }
}
