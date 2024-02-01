package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abc", s = "dog cat dog";
        System.out.println(wordPattern(pattern,s));
    }


    public static boolean wordPattern(String pattern, String s) {

        Map<Character, String> checkmap=new HashMap<>();
        String sarray[]=s.split(" ");

if(pattern.length()!=sarray.length) {
    return false;
}

        for (int i = 0; i <sarray.length ; i++) {
            if(checkmap.isEmpty()) {
                checkmap.put(pattern.charAt(i), sarray[i]);
            }
            else {
                if(checkmap.containsKey(pattern.charAt(i))){
                   if(checkmap.get(pattern.charAt(i)).equals(sarray[i])){
                       continue;
                   }
                   else {
                       return false;
                   }
                } else if (checkmap.containsValue(sarray[i])) {
                    return false;
                    
                } else {
                    checkmap.put(pattern.charAt(i), sarray[i]);

                }
            }

        }

        return true;

    }

}