package org.example;

public class UniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            if(s.lastIndexOf(s.charAt(i))==i && s.indexOf(s.charAt(i))==i){
                return i;
            }

        }

        return -1;

    }
}
