package leetcode;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={4,5,7,89,9};
        System.out.println(linearSearch(arr,4));
    }
    public static int linearSearch(int[] nums, int ele){
        int index=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==ele){
                index=i;
            }
        }

        return index;
    }
}
