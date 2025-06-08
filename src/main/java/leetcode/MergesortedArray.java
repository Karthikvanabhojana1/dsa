package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MergesortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,3};
        System.out.println(findUnion(arr,arr1,5,3));
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {

        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int size = 0;
        int right = 0;
        // add your code here
        while (left < n && right < m) {
            if (arr1[left] > arr2[right]) {
                if (list.size() > 0 && list.get(size-1) == arr2[right]) {
                    right++;
                } else {
                    list.add(arr2[right]);
                    size++;
                    right++;
                }
            } else {
                if (list.size() > 0 && list.get(size-1) == arr1[left]) {
                    left++;
                } else {
                    list.add(arr1[left]);
                    size++;
                    left++;
                }
            }
        }
        while (right < m) {
            if (list.size() > 0 && list.get(size-1) == arr2[right]) {
                right++;
            } else {
                list.add(arr2[right]);
                size++;
                right++;
            }

        }
        while (left < n) {
            if (list.size() > 0 && list.get(size-1) == arr1[left]) {
                left++;
            } else {
                list.add(arr1[left]);
                size++;
                left++;
            }
        }
        return list;
    }
}
