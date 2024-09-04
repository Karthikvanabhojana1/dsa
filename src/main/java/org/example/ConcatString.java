package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConcatString {

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String words[] = {"foo","bar"};


        System.out.println(findSubstring(s,words));

        }



    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> list=new ArrayList<>();

int lenghtString=s.length();
int wordslength=0;
String txt=words[0];

        for (int i = 0; i <words.length ; i++) {
            wordslength+=words[i].length();
        }

    if(wordslength>lenghtString){
        return list;
    }
        for (int i = 1; i <words.length ; i++) {
            txt += "" + words[i];
        }


        for (int i = 0; i <lenghtString-wordslength; i++) {
            if(s.substring(i, i+wordslength-1).equals(txt)){
                list.add(i);
            }

        }


return list;
    }

}
