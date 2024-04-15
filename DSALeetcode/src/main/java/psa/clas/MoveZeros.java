package psa.clas;

import java.util.Stack;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={0,0,1,3,12};
        moveZeroes(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
      
    }
    public static void moveZeroes(int[] nums) {
            if (nums.length == 1) {
                return;
            }

            int nonZeroIndex = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[nonZeroIndex] = nums[i];
                    nonZeroIndex++;
                }
            }


            while(nonZeroIndex<nums.length){
                nums[nonZeroIndex] = 0;
                nonZeroIndex++;
            }
        }

}
