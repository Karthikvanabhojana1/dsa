package org.example;

public class ProfitonStock {
    public static int maxProfit(int[] prices) {
        int max=0;
        int diff=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1])
            diff+=prices[i]-prices[i-1];

        }


        return diff;
    }
    public static void main(String[] args) {
        int[] nums1 = {7,1,5,3,6,4};
        int value=maxProfit(nums1);
        System.out.println(value);
    }
}
