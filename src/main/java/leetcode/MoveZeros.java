package leetcode;

public class MoveZeros {
    public static void main(String[] args) {
        int a[]={3,4,6,0,8,0,9,0};
        moveZeroes(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
            System.out.println();

    }
    public static void moveZeroes(int[] nums) {
        if (nums.length==0) return;
int i=0,j=0;
while (i< nums.length){
    if (nums[i]==0) break;
    i++;
}
j=i+1;
while(j<nums.length){
    if(nums[j]!=0){
       int temp= nums[i];
       nums[i]=nums[j];
       nums[j]=temp;
       i++;

    }
    j++;
}


    }
}
