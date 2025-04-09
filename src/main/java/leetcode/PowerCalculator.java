package leetcode;

public class PowerCalculator {
    int sum=1;
    public double myPow(double x, int n) {
        //recurrsive solution
//        if(n==0)
//            return 1;
//        if(n>0){
//            return x*myPow(x,n-1);
//
//        }
//        else {
//            return myPow(x,n+1)/x;
//        }
        if(x==1) return x;
        int i=n;
        double result=1.00;
        while(i!=0){
            if(n>0){
                result=result*x;
                i--;
            }
            if(n<0){
                result=result/x;
                i++;
            }
        }
        return  result;
    }

}
