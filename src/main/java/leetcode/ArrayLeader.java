package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        int max=Integer.MIN_VALUE;
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = arr.length-1; i >=0; i--) {
            if(max<=arr[i]){
                max=arr[i];
                list.add(arr[i]);
            }

        }
        Collections.reverse(list);
return list;
    }
}
