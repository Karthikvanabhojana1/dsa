package leetcode;

import java.util.List;

public class FindRotation {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int mini=Integer.MAX_VALUE;
        int num=arr.size();
        int start=0;
        int minloc=0;
        int end=num-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr.get(start)<=arr.get(mid)){
                if(mini>arr.get(start)){
                    mini=arr.get(start);
                    minloc=start;
                }
                start=mid+1;

            }
            else {
                if(mini>arr.get(mid)){
                    mini=arr.get(mid);
                    minloc=mid;
                }

                end =mid-1;
            }

        }
        return minloc;
    }
}
