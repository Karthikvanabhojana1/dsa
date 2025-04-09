package leetcode;

import java.util.*;

public class KthMissingterm {
    public int findKthPositive(int[] arr, int k) {
        int low=0; ////////2,3,4,7,11 low=0
        int high=arr.length-1; //high=4

        while(low<=high){ // 0<=11
            int mid=(high+low)/2;
            if(arr[mid]-mid-1<k){
                low=mid+1;

            }
            else {
                high=mid-1;
            }
        }
        return low+k;//
    }
}
