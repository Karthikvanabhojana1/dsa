package org.example;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    public static void main(String[] args) {
int test[]={3,0,6,1,5};
        System.out.println(hIndex(test));

    }
    public static  int hIndex(int[] citations) {
        Arrays.sort(citations);
        int answer=0;
        int left=0, right=citations.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            int idx=citations.length-mid;

            if(citations[mid]>=idx) {
                answer=idx;
                right=mid-1;

            }
            else {
                left=mid+1;
            }
        }
        return answer;
    }


}
