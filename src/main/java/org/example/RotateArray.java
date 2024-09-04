package org.example;

public class RotateArray {
        public static void rotate(int[] nums, int k) {
//int temp=k;
//while(temp>=1) {
//    int temp1=nums[nums.length-1];
//    for (int i = nums.length-1; i > 0; i--) {
//nums[i]=nums[i-1];
//
//    }
//    nums[0]=temp1;
//    temp--;
//}
            int n = nums.length;
            k = k % n;
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
            for (int i = 0; i <nums.length; i++) {
                System.out.println(nums[i]);
            }
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
int k=3;
rotate(nums1,k);
    }
}
