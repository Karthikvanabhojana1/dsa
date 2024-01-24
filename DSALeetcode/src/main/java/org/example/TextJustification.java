package org.example;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String arr[]={"This", "is", "an", "example", "of", "text", "justification."};
        List<String> arrList=fullJustify(arr,16);
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> arrList=new ArrayList<>();
        int width=0;
       int  count=0;
       int widthcount=0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()<maxWidth){
                if(widthcount<maxWidth){
                    if(widthcount+words[i].length()<widthcount){
                        arrList.add(words[i].trim());
                        widthcount+=words[i].trim().length();
                        width+=words[i].trim().length();
                    }
                    else {
                        if(arrList.size()!=0) {
                            int mid = (maxWidth - widthcount)/arrList.size();
                            while (mid!=0){
                                for (int j = 0; j <arrList.size() ; j++) {
                                    StringBuilder sb=new StringBuilder();
                                    sb.append(arrList.get(j));
                                    sb.append(" ");
                                    arrList.set(j,sb.toString());

                                }
                                mid--;
                            }
                        }

width=0;
                    }
                    }
                }
            }
        return arrList;

        }

}
