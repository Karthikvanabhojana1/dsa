package org.example;

public class SuminArray {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4};
        int sum=6;
        int[] res=sum(nums1,sum);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);

        }
    }

    private static int[] sum(int[] numbers, int target) {
        int res[]=new int[2];
        int low=0;
        int high=numbers.length-1;
        while(low< high){
            int sum=numbers[low]+numbers[high];
            if(sum>target){
                high-=1;

            }
            else if(sum<target){
                low+=1;

            }
            else {
                res[0]=low+1;
                res[1]=high+1;
                return res;

            }
        }
        return res;

    }
}
