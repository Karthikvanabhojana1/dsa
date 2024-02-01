package org.example;

public class Anagram {

    static  final int CHAR=256;
    public static boolean isAnagram(String s, String t) {
if(s.length()!=t.length()){
    return false;
}
int count[]=new int[CHAR];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if(count[i]!=0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
String s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s,t));
    }
}
