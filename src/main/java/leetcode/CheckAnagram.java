package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

        public static boolean isAnagram (String s, String t){
            Map<Character, Integer> mapvalues = new HashMap<>();
            if (s.length() != t.length()) return false;
            for (int i = 0; i < s.length(); i++) {
                mapvalues.put(s.charAt(i), mapvalues.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (int i = 0; i < t.length(); i++) {
                if (mapvalues.containsKey(t.charAt(i))) {

                    if (mapvalues.get(t.charAt(i)) < 1) {
                        return false;
                    }
                    mapvalues.put(s.charAt(i), mapvalues.getOrDefault(s.charAt(i), 1) - 1);
                }
                else {
                    return false;
                }

            }

            return true;
        }

    public static void main(String[] args) {
        System.out.println(isAnagram("aacc","ccac"));
        System.out.println(isAnagram("a","a"));
        System.out.println(isAnagram("anagram","nagaram"));
    }

}
