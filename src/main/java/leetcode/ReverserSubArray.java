package leetcode;

import java.util.ArrayList;

public class ReverserSubArray {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        // code here
        if( l>=r){
            return arr;
        }
        int tenp=arr.get(l);
        arr.set(l, arr.get(r));
        arr.set(r,tenp);
       return reverseSubArray(arr,l,r);
    }
}
