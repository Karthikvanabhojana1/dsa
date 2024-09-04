package org.example;

public class WildcardMapping {
    public static void main(String[] args) {
        String s1="aa";
        String s2="*";
        System.out.println(isMatch(s1,s2));

    }
    public static boolean isMatch(String s, String p) {
if (s==null || p==null) return false;
if(s=="*" || p=="*") return true;
if(s.length()!=p.length()) return false;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==p.charAt(i)){
                continue;
            }
            else if(s.charAt(i)=='?' || p.charAt(i)=='?'){
                continue;
            }
            else return false;

        }
return true;
    }
}
