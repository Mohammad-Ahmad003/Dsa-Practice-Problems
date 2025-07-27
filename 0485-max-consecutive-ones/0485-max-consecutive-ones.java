class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=0;
        int mxcount=0;
        int left=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                len=r-left+1;
                if(len>mxcount){
                    mxcount=len;
                }
            }
            else{
                left=r+1;
            }
        }
        return mxcount;
    }
}