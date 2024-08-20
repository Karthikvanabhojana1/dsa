package org.example;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums1 = {3,2,5,3,9,2};
        int m = 2;


        int value =secondLargest(nums1);
        System.out.println(value);
    }

    private static int secondLargest(int[] nums1) {
        int second=-1;
        int largest=0;
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[largest]<nums1[i]) {
                {
                    second=largest;
                    largest=i;
                }}
                else if(nums1[i]!=nums1[largest]){
                    if(second==-1 || nums1[i]>nums1[second]){
                        second=i;

                    }

                }
            }

        return second;
    }
}
