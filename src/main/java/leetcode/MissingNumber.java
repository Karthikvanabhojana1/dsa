package leetcode;

public class MissingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {

            sum=sum+nums[i];

        }

        int total=(len*(len+1)/2);
        return total-sum;
    }
}
