package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixzeros {

    //brute force
//    public static void setZeroes(int[][] matrix) {
//        Set<Integer> rowset =new HashSet<>();
//        Set<Integer> columnset =new HashSet<>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(matrix[i][j]==0){
//                    rowset.add(i);
//                    columnset.add(j);
//                }
//            }
//        }
//        for (int i = 0; i < rowset.size(); i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if(rowset.contains(j)){
//                    for (int k = 0; k < matrix[j].length; k++) {
//                        matrix[j][k]=0;
//                    }
//                }
//
//            }
//        }
//        for (int i = 0; i < rowset.size(); i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                    for (int k = 0; k < matrix[j].length; k++) {
//                        if(columnset.contains(k)){
//                            matrix[j][k]=0;
//                    }
//                }
//
//            }
//        }
//
//    }
    public static void setZeroes(int[][] matrix) {
        int col0=1;
        int n=matrix.length;
        int m=matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;

                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j]!=0){
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for (int j = 0; j < m; j++) {
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for (int j = 0; j < n; j++) {
                matrix[j][0]=0;
            }
        }

    }
    public static void main(String[] args) {

        int[][] matrix =         {{0,1,2,0},{3,4,5,2},{1,3,1,5}}
                ;
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
