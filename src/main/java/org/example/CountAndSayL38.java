package org.example;

import java.util.Arrays;

public class CountAndSayL38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        if (n==1) return "1";

        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb = getNextState(sb); //1 11 21
        }
        return sb.toString();
    }
    private static StringBuilder getNextState(StringBuilder curSb) {
        StringBuilder nextSb = new StringBuilder();
        int len = curSb.length();
        int i = 0;

        while (i < len) {  // 0<1  1<1 /0<2 2<2 /0<2
            char c = curSb.charAt(i++); //'1' '1' '2'
            int count = 1;
            while (i < len && c == curSb.charAt(i)) {  //1<1 //1<2;  1==1 //
                count++; //2
                i++;
            }
            nextSb.append(count).append(c); //11, 21 ,1211
        }

        return nextSb;
    }
}
