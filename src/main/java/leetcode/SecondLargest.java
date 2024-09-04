package leetcode;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={89,89};
        System.out.println(printsecondlargest(arr));
    }
    public static int printsecondlargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE; //-1

        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second && arr[i]!=max){
                second=arr[i];
            }
        }
       if(second==Integer.MIN_VALUE)
           return -1;

        return second;

    }
//    public int print2largest(int[] arr) {
//        int max=arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (max<arr[i]){
//                max=arr[i];
//            }
//        }
//        int second = Integer.MIN_VALUE; //-1
//        for (int i=0;i<arr.length;i++){
//            if (second<arr[i] && arr[i]!=max){
//                second=arr[i];
//            }
//        }
//        return second;
//
//    }

}
