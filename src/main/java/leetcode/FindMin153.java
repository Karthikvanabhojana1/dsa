package leetcode;

public class FindMin153 {
    public static int findMin(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int num=nums.length;
        int start=0;
        int end=num-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[start]<=nums[end]){
              mini=  Math.min(mini,nums[start]);
                start=mid+1;

            }
            else {
               mini= Math.min(mini,nums[mid]);
                end =mid-1;
            }
            System.out.println("Start= "+start+ " End= "+end+" Min= "+mini);

        }
        return mini;
    }

    public static void main(String[] args) {
        int arr[]={5,6,1,2,3,4};
        System.out.println(findMin(arr));

    }
}
