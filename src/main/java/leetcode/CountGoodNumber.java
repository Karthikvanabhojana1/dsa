package leetcode;

public class CountGoodNumber {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenPositions = n / 2;
        long oddPositions = n - evenPositions;

        long pow5 = modPow(5, oddPositions, MOD);
        long pow4 = modPow(4, evenPositions, MOD);

        return (int)((pow5 * pow4) % MOD);
    }

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;

        while (exp > 0) {
            if (exp %2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp=exp/2;
        }

        return result;
    }
}
