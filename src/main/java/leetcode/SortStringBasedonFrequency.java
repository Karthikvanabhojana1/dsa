package leetcode;

import java.util.*;

public class SortStringBasedonFrequency {
    public String frequencySort(String s) {


        // append to map generic approach to calculate frequency
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // append the keyset to the list
        List<Character> characters = new ArrayList<>(freqMap.keySet());
        //sort the map based on the sorted key set
        characters.sort((a, b) -> freqMap.get(b) - freqMap.get(a));
//append it to string
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            int freq = freqMap.get(c);
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }

        }
        return result.toString();
    }
}
