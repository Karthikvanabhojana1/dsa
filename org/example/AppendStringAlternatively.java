package org.example;

public class AppendStringAlternatively {
    public static void main(String[] args) {
        System.out.println("Merge Output"+mergeAlternately("Heloe","ANO"));
        System.out.println("Difference " +findTheDifference("helo","heo"));

    }
    public static String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<word1.length() || j<word2.length()) {
            if(i<word1.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }}
        return sb.toString();
    }
    public static char findTheDifference(String s, String t) {
        int sum=0,sum2=0;
        for (int i = 0; i <s.length() ; i++) {
             sum+=s.charAt(i);

        }
        for (int i = 0; i <t.length() ; i++) {
            sum2+=t.charAt(i);

        }
        int diff= Math.abs(sum-sum2);
        char character = (char) diff;
        return character;

    }


}

