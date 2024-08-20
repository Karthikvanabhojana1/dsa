package org.example;

public class LongestPrefix {


    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(res) != 0){
                res=res.substring(0,res.length()-1);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String str[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));

    }
}
