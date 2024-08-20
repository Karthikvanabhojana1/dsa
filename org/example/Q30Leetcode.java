package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q30Leetcode {


    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String words[] = {"foo","bar"};
        System.out.println(findSubstring(s,words));

    }

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int start = 0; start < wordLength; start++) {
            int left = start;
            Map<String, Integer> currentCount = new HashMap<>();
            int count = 0;

            for (int right = start; right <= s.length() - wordLength; right += wordLength) {
                String word = s.substring(right, right + wordLength);

                if (wordCount.containsKey(word)) {
                    currentCount.put(word, currentCount.getOrDefault(word, 0) + 1);
                    count++;

                    while (currentCount.get(word) > wordCount.getOrDefault(word, 0)) {
                        String leftWord = s.substring(left, left + wordLength);
                        currentCount.put(leftWord, currentCount.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }

                    if (count == words.length) {
                        result.add(left);
                        String leftWord = s.substring(left, left + wordLength);
                        currentCount.put(leftWord, currentCount.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }
                } else {
                    currentCount.clear();
                    count = 0;
                    left = right + wordLength;
                }
            }
        }

        return result;
        }




    }
