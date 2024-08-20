package clas;

import java.util.Scanner;

public class UserInputreccursively {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        checkinput(myObj.nextInt());

    }

    private static void checkinput(int i) {

        if (i>=1 && i<=10) {
            System.out.println("Input sucessfull");
        }
        else {
            System.out.println("Enter correct value ");
            Scanner myObj = new Scanner(System.in);
            checkinput(myObj.nextInt());
        }
    }
}
