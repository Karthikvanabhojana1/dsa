package org.example;

public class AddElementArrayLocation {

    public static int addelement(int[] nums, int val,int cap, int ele,int pos) {
       if(val==cap){
           return val;
       }
       int idx= pos-1;
        for (int i = 0; i >= idx  ; i--) {
            nums[i+1]=nums[i];
            nums[idx]=ele;
        }
        return val+1 ;

    }
    public static void main(String[] args) {
        int cap=10;
        int[] nums1 = {3,2,1,0,4};
        int m = 3;
        int ele=2;
int pos=1;

        int value =addelement(nums1, m ,cap,ele,pos);
            System.out.println(ele+" Added to the location " +value);


    }
}
