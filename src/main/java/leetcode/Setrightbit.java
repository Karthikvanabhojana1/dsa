package leetcode;

public class Setrightbit {
    static int setBit(int n) {
        // code here
        return n | (n-1);

    }

    public static void main(String[] args) {
        System.out.println(setBit(15));
    }
}
