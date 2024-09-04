package org.example;

public class Stringpalindrome {
    public static void main(String[] args) {
        String value = ".a";
      boolean val= isPalindrome(value);
        System.out.println(val);
    }

    public static boolean isPalindrome(String s) {
        s=cleanAndLowerCase(s);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    private static String cleanAndLowerCase(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

}
