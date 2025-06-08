package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParenthisis {
    public static void main(String[] args) {
        int n=3;
        List<String> list= generateParenthesis(n);
        list.stream().forEach(System.out::println) ;
    }

        public static List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            recurparanthesis(res,0,0,"",n);
            return res;

        }

        private static void recurparanthesis(List<String> res, int left, int right,String s, int n) {
            if(s.length()==n*2){
                res.add(s);
                return;
            }
            if(left<n){
                recurparanthesis(res,left+1,right,s+"(",n);
            }
            if(right<left){
                recurparanthesis(res,left,right+1,s+")",n);

            }
        }
}
