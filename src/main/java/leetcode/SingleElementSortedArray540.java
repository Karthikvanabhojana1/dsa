package leetcode;

public class SingleElementSortedArray540 {
    public static int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if (nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) {
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]) {
            return nums[nums.length-1];
        }
        while (low<=high) {
            int mid = (low + high) / 2;
            if (mid == 0 || mid == nums.length - 1) return -1;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 1) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else if (mid % 2 == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,5,5,6,6};
        System.out.println(singleNonDuplicate(arr));
    }
}
