package leetcode;

public class NthRoot {
    public static int NthRoot(int n, int m)
    {
        // code here
        int low=1, high=m;
        while(low<=high){
            int mid=(high+low)/2;
            int pow=(int)Math.pow(mid,n);
            if(m==pow){
                return mid;
            }
            else if (pow>m){
                high =mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int n=2,m=9;
        System.out.println(NthRoot(n,m));
    }
}
