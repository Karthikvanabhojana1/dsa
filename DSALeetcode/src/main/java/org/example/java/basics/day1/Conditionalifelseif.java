package DSALeetcode.src.main.java.org.example.java.basics.day1;

public class Conditionalifelseif {
    public static void main(String[] args) {
        double n1 = 22228.25, n2 = 3339.9, n3 = 299.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
