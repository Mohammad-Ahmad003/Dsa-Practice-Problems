class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = 0;
        int maxlen = 0;
        int l=0,r=0;
        int zeroes=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes<=k){
                len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            r++;
        }
        return maxlen;
    }
}