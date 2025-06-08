package leetcode;

import java.util.Arrays;

public class FindSealandfloorofNuminarray {


        public static int[] getFloorAndCeil(int[] a, int n, int x) {
            // Wriute your code here.
            int start=0, high=n-1;
            int floor=-1, ciel=high;
            while(start<=high){
                int mid=(start+high)/2;
                if(a[mid]==x){
                    floor=mid;
                    high=mid-1;
                }
                else if(a[mid]>x){
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
                if(a[mid]==x){
                    ciel=mid;
                    start=mid+1;
                }
                else if(a[mid]>x){
                    high=mid-1;
                }
                else{
                    start=mid+1;
                }

            }



            return new int[]{floor, ciel};
        }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,8,8,9,20};
        int ress[]=getFloorAndCeil(arr,arr.length,8);
        System.out.println(Arrays.toString(ress));
    }

    int s= 3>0?0:2;
}
