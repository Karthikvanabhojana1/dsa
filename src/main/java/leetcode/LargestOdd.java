package leetcode;

public class LargestOdd {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));

    }
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>-1;i--){
            int value=Integer.parseInt(String.valueOf(num.charAt(i)));
            if(value%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
