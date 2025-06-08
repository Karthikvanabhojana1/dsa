package leetcode;

import java.util.Arrays;

public class Rotatearrayleft {
    public static void main(String[] args) {
        int[] arr ={3,4,7,8,9,0};
        rotate(arr,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);;
        }
        System.out.println();
    }
        public static void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        int[] rotatedArray= new int[nums.length];
            for (int i = 0; i < len; i++) {
                rotatedArray[(i+k)%len]=nums[i];
            }
            for (int i = 0; i < len; i++) {
                nums[i]=rotatedArray[i];
            }
        }

}
