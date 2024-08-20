package org.example;

public class CountPrime {
    public static void main(String[] args) {
        System.out.println("Value "+countPrimes(100));
    }
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 3; i < n; i += 2) {
            isPrime[i] = true;
        }

        isPrime[2] = true;

        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j] = false;
                    System.out.print(j+" ");
                }
                System.out.println("");
            }
        }
// check no of prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
