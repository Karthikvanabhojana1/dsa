package org.example;

import java.util.HashSet;

public class ValidSudoke {
    public static void main(String[] args) {

        char[][] charbord = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(charbord));

    }
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> hash=new HashSet<>();
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9; j++) {
                char charAt=board[i][j];
                if(charAt !='.'){
                  if(!hash.add(charAt+ "found at row "+i) ||
                    !hash.add(charAt+ "found at Column "+j)||
                    !hash.add(charAt+ "found at sub box "+i/3+ "-" +j/3)){
                      return false;
                  }
                }


            }
        }





        return true;

    }
}
