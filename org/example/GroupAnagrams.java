package org.example;

import java.util.*;

import static java.sql.Types.CHAR;

public class GroupAnagrams {
    public static void main(String[] args) {
        String test[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(test);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String s = String.valueOf(temp);

            // if already present it creates new List of Strings
//            and then add this to the already present or created LIst
            map.putIfAbsent(s, new ArrayList<String>());
            map.get(s).add(strs[i]);
        }

        return new ArrayList<>(map.values());



    }


}
