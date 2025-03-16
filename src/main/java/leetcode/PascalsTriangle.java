package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList<>();
        res=generate(5);
        System.out.println(res);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();

        for (int i = 1; i < numRows+1; i++) {
            List<Integer> row= generaterow(i);
            res.add(new ArrayList<>(row));
        }
        return res;
    }

    private static List<Integer> generaterow(int i) {
        List<Integer> resrow=new ArrayList<>();
int result=1;
        resrow.add(result);
        System.out.println("initt- "+resrow);
        for (int j = 1; j <i; j++) {
            result*=i-j;
            result=result/j;
//            System.out.println(result);
            resrow.add(result);
        }
        System.out.println(resrow);
        return resrow;
    }
}
