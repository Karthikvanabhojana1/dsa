package org.example;

public class MirrorArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Original 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        rotate(matrix);

        System.out.println("After rotating by 90 degree 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }


    public static void rotate(int[][] matrix) {

int length= matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
              int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length/2; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][length-1-j];
                matrix[i][length-1-j]=temp;
            }
        }



    }
}
