package leetcode;

public class DivideTwoInteger {
    public int divide(int dividend, int divisor) {
        if(dividend==0) return 0;
        if(divisor==1) return dividend;
        else if(divisor==-1) {
            return -dividend;
        }
        else{
            int sign=1;
            if(dividend<0!=divisor<0){
                sign=-1;
            }
            dividend=Math.abs(dividend);
            divisor=Math.abs(divisor);
            int quotient=0;
            while(dividend>=divisor){
                int temp_deviser=divisor;
                int multiple=1;
                while (dividend>(temp_deviser<<1)){
                    temp_deviser<<=1;
                    multiple<<=1;

                }
                dividend=temp_deviser;
                quotient+=multiple;

            }

            if(quotient>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(quotient<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else return quotient;
        }
    }
}
