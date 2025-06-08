package org.example;

public class HappyNumber {
    public static boolean isHappy(int n) {
boolean flag=true;

         if((n*n)>10){
             while((n*n)>10){
                 int temp=n;
                 int res=0;
                 while (temp>0){
                     res+=Math.pow((temp%10),2);
                     temp=temp/10;
                 }
                 n=res;
             }

         }
        if(n==1){
            return true;
        }
        if((n*n)<10){
            return false;
        }
         return true;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(isHappy(n));
    }
}
