package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency {
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for (int i = 1; i <=arr.length ; i++) {
            list.add(map.getOrDefault(i,0));
        }
        return list;
    }
}
