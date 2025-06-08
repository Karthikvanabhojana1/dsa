package leetcode;

public class PrintNNumberWithoutLoop {
    public static void printNos(int N)
    {
        //Your code here
        if(N > 0)
        {
            printNos(N-1);
            System.out.print(N+" ");
        }
        return;

    }

    public static void main(String[] args) {
        printNos(2);
    }
}
