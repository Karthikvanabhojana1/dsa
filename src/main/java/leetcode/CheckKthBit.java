package leetcode;

public class CheckKthBit {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        n=n>>k;
        int val=n&1;
        if(val ==1) return true;
        else
            return false;




}
}
