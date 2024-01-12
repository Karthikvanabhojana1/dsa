package org.example;

public class NtoOnePrint {
    public static void main(String[] args) {
        print(90);
    }
    static void  print(int num){
        if(num<1) {
            return ;
        }
        System.out.print(num+ " ");
        print( num-1);
    }

}
