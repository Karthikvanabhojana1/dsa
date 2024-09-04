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


//        System.out.println(s1.equals(t));;
    }

//private method(T anentry){
//        int where =-1;
//        int index=0;
//        while (where!=-1 && (index<numberofEntries)) {
//            if(anentry.equals(bag[index])){
//                found=true;
//                where=index;
//                return true;
//            }
//            index++
//        }
//        return false;
//}

}
