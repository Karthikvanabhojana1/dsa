package org.example.tree;

public class Test {
    public int func (int n){
        int result; if (n == 1)
            return 1;
        result = func(n - 1);
        return result;
    }
    public static void main (String args[]) {
        Test obj = new Test () ;
        System.out.print (obj.func (5));
    }
}
