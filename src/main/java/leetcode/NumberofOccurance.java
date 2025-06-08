package leetcode;

public class NumberofOccurance {
   public int count(int[] arr, int n, int x) {
        // code here
            int start=0, high=n-1;
            int floor=-1, ciel=-1;
            while(start<=high){
                int mid=(start+high)/2;
                if(arr[mid]==x){
                    floor=mid;
                    high=mid-1;
                }
                else if(arr[mid]>x){
                    high=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
        start=0;
        high=n-1;
        while(start<=high){
            int mid=(start+high)/2;
            if(arr[mid]==x){
                ciel=mid;
                start=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        if (ciel==-1 && floor ==-1) return 0;
        if(ciel==-1) return floor;
        if(floor==-1) return ciel;
        else
            return  ciel - floor + 1;
    }
}
