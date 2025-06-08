package org.example;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteLeetCode {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc","baba"));
    }
    public static boolean isIsomorphic(String s, String t) {

        Map<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.size()<=0){
                map.putIfAbsent(s.charAt(i),t.charAt(i));

            } else if (map.containsKey(s.charAt(i))||map.containsValue(t.charAt(i))) {
                if(map.get(s.charAt(i))!=t.charAt(i) ){
                    return false;
                }
                if(map.containsValue(t.charAt(i))){
                    Character te=null;
                    for (Map.Entry<Character, Character> entry : map.entrySet()) {
                        if (entry.getValue().equals(t.charAt(i))) {
                            te= (entry.getKey());
                }

                        }

                    if(te!=t.charAt(i)){
                        return false;
                    }

                }
                else {
                    map.putIfAbsent(s.charAt(i),t.charAt(i));
                }
        }


            else{
                map.putIfAbsent(s.charAt(i),t.charAt(i));

            }
        }

        return true;

    }
}
