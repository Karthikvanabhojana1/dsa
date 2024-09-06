package leetcode;

import java.util.ArrayList;

public class FindAllFactorialValuelessthanN {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList <Long> list=new ArrayList<>();
        long fac=1L;
        for (int i = 1; i <= n; i++) {
            fac= fac*i;
            if(n<fac){
                return list;
            }
            list.add(fac);

        }        return list;
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(4));
    }

}
