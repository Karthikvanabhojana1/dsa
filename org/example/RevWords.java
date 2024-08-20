package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RevWords {


    public static String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);

        return String.join(" ", words);
    }


    public static void main(String[] args) {
        String  s = "a good   org.example";
        System.out.println(reverseWords(s));
    }
}
