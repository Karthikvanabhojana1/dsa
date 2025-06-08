package leetcode;

public class RotateArray {
    public void rotate(int[][] matrix) {
        int num=matrix.length;
        for (int i=0;i<num;i++){
            for (int j=i;j<num;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i=0;i<num;i++){
            for (int j=0;j<num/2;j++){
                int temp=matrix[i][num-j-1];
                matrix[i][num-j-1]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

    }
}
