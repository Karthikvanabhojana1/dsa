package leetcode;
//if the sum of its own digits raised to a power of digits results in the number itself
public class AmstrongQ1134 {
    public static void main(String[] args) {
int num=153;
        System.out.println(isamstrong(num));
    }

    private static int countnum(int num) {
        int temp=num;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        return count;

    }

    public static  boolean isamstrong(int num){
        int value=countnum(num);
        int temp=num;
        int res=0;
        while (temp>0){
            int rem = temp % 10;
            res = (int) (res + (Math.pow(rem, value)));
            temp = temp / 10;

        }
        return res==num;
    }
// time complexity is 0(n)

}
