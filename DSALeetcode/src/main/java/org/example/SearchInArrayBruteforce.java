package org.example;

import static java.lang.System.exit;

public class SearchInArrayBruteforce {

    public static int search(int[] nums, int val, int ele) {
for(int i=0;i<val;i++) {
    if(nums[i]==ele) {
return i;
    }

}

        return 0;

    }
    public static void main(String[] args) {
        int[] nums1 = {3,2,1,0,4};
        int m = 3;
        int ele=2;


        int value =search(nums1, m ,ele);
        if(value!=0){
            System.out.println(ele+" is present in location "+value);

        }
    }
}
