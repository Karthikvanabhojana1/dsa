package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomantoInt {
    public static int romanToInt(String s) {
        int value=0;
        for (int i = 0; i < s.length(); i++) {
            int charvalue=0;
            switch (s.charAt(i)) {
                case 'I':
                    int counti=0;
                    while(s.length()>i && s.charAt(i)=='I'){
                        i++;
                        counti++;
                    }
                    if(s.length()>i && s.charAt(i)=='X'){
                        charvalue=charvalue+10-counti;
                    }
                    else if(s.length()>i && s.charAt(i)=='V'){
                        charvalue=charvalue+5-counti;
                    }
                    else {
                        i--;
                        charvalue=charvalue+counti;
                    }
                    break;
                case 'V':charvalue=5;
                break;
                case 'X':
                    int countx=0;
                    while(s.length()>i && s.charAt(i)=='X'){
                        i++;
                        countx++;
                    }
                    if(s.length()>i && s.charAt(i)=='C'){
                        charvalue=charvalue+100-(countx*10);
                    }
                    else if(s.length()>i && s.charAt(i)=='L'){
                        charvalue=charvalue+50-(countx*10);
                    }
                    else {
                        i--;
                        charvalue=charvalue+(countx*10);
                    }
                break;
                case 'L':charvalue=50;
                break;
                case 'C':
                    int countc=0;
                    while(s.length()>i && s.charAt(i)=='C'){
                        i++;
                        countc++;
                    }
                    if(s.length()>i && s.charAt(i)=='D'){
                        charvalue=charvalue+500-(countc*100);
                    }
                    else if(s.length()>i && s.charAt(i)=='M'){
                        charvalue=charvalue+1000-(countc*100);
                    }
                    else {
                        i--;
                        charvalue=charvalue+(countc*100);
                    }
                break;
                case 'D':charvalue=500;
                break;
                case 'M':charvalue=1000;
                break;
            }
            value=charvalue+value;
        }
        return value;



//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//        int r = 0;
//
//        for(int i = 0; i < s.length()-1; i++){
//            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
//                r -= map.get(s.charAt(i));
//            }else {
//                r += map.get(s.charAt(i));
//            }
//        }
//        return r + map.get(s.charAt(s.length() - 1));



    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMMCC"));
    }
}
