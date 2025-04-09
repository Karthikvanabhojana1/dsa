package leetcode;

public class Iseven {
    static boolean isEven(int n) {
        // code here
        int value=n&1;
        if(value==0)
            return true;
        else return false;


    }

    public static void main(String[] args) {
        System.out.println(isEven(8));
    }
}
