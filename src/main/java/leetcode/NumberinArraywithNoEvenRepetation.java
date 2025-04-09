package leetcode;

public class NumberinArraywithNoEvenRepetation {
    public int singleNumber(int[] nums) {


    //bruteforce
        //    Map<Integer,Integer> map=new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        int ans=0;
        for(int i=0;i<nums.length;i++){
        ans=ans^nums[i];
    }
        return ans;
}
}
