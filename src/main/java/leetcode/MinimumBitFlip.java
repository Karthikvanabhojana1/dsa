package leetcode;

public class MinimumBitFlip {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal; //xor gate for to find diff
        int count=0;
        for(int i=0;i<32;i++){
            if((ans & (1<<i))!=0){ //count ith index is set or not
                count+=1;
            }
        }
        return count;
    }
}
