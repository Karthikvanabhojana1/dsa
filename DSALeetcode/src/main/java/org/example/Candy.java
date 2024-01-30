package org.example;

public class Candy {

        public static int candy(int[] ratings) {
            int total=0;
            int arr[]=new int[ratings.length];
            for (int i=0;i<ratings.length;i++) {
                arr[i]=1;
            }

            for (int i=1;i<ratings.length;i++){
                if(ratings[i]>ratings[i-1]){
                    arr[i]=arr[i-1]+1;
                }

            }

            for (int i = ratings.length-2; i>=0; i--) {
                if(ratings[i]>ratings[i+1]){
                    if(arr[i] <= arr[i+1])
                        arr[i] = arr[i+1] + 1;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                total+=arr[i];

            }
            return total;
        }

    public static void main(String[] args) {
        int height[] = {1,2,2,3,4};
        System.out.println("sum: "+candy(height));
    }
}
