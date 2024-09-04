package greeksforgreeks;
//Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD.
//The function takes two integers a and b as input and returns a list containing their LCM and GCD.


public class GCDandLCM {
    public static void main(String[] args) {
calculategcdlcm(12,5);
        System.out.println(lcmAndGcd(12L, 6L)[0]);
;    }
public static  void  calculategcdlcm(int x,int y){
        int low=x<y?x:y;
        int max=x>y?x:y;
        if (max%low==0) {
            System.out.println(low);
            return;
        }
        int temp=low;
        int val=1;
        while (temp>1){
            if(max%temp==0 && low%temp==0) {
                max=max/temp;
                low=low/temp;
                val=val*temp;
            }
            else temp--;
        }
    System.out.println(val);
}

    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] gcdlcm =new Long[2];
        gcdlcm[1] =gcdeuclidian(A,B);
        gcdlcm[0]=(A*B)/gcdlcm[1];

       return gcdlcm;

    }
    public static  Long  gcdeuclidian(Long x,Long y) {
        if (y==0) return x;
        return gcdeuclidian(y,x%y);
    }

}
