package org.example;

public class onetoNprint {
    public static void main(String[] args) {
        print(90);
    }
    static void  print(int num){
        if(num<1) {
            return ;
        }
        print(num-1);
        System.out.print(num+ " ");

    }
}
