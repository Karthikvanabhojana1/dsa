package leetcode;

public class SetCount {
    public static int countSetBits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int x = i;
            while (x > 0) {
                x = x & (x - 1);
                count++;
            }
        }
        return count;
    }
}
