package org.example;

import java.util.*;

import static java.lang.System.exit;

public class ThreesumProblem {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int low=0;
            int calc=(-1)*nums[i];
            int high=nums.length-1;
            while(low<high) {
                if(low!=i && high!=i){
                    int sum=(nums[low]+nums[high]);

                    if(sum>calc){
                        high-=1;

                    }
                    else if(sum<calc){
                        low+=1;

                    }
                    else{
                        List<Integer> arrlist=new ArrayList<>();
                        arrlist.add(nums[i]);
                        arrlist.add(nums[low]);
                        arrlist.add((nums[high]));
                        Collections.sort(arrlist);
                        set.add(arrlist);
                        low+=1;
                        high-=1;

                    }
                }
                else if(low==i) {
                    low++;
                }
                else{
                    high--;
                }

            }
        }
        list.addAll(set);

return list;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,1,2,-1,-4};
        List<List<Integer>> res=threeSum(nums1);
        for (int i = 0; i <res.size() ; i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j));
            }
            System.out.println();


        }
    }
}
