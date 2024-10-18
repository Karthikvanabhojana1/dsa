package leetcode;

public class KokoEatingBananas875 {
    public static void main(String[] args) {
        int h=1000000000;
        int arr[]={805306368,805306368,805306368};
        System.out.println(minEatingSpeed(arr,h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max=Math.max(max,piles[i]);

        }
        int ans=0;
        int low=1;
        int high=max;
        while (low<=high){
            int mid=(low+high)/2;
            int totaltime=totaltime(mid,piles);
            if(totaltime<=h){
                high=mid-1;
                ans=mid;
            }
            else {
                low=mid+1;

            }
        }
        return ans;

    }

    private static int totaltime(int mid, int[] piles) {
        int time=0;
        for (int i = 0; i < piles.length; i++) {
            time+=Math.ceil((double)piles[i]/(double)mid);

        }
        return time;
    }
}
