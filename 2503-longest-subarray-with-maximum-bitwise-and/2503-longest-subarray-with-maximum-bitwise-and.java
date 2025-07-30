class Solution {
    public int longestSubarray(int[] nums) {
        int indx=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                indx=i;
            }
        }
        int j=indx;
        int len=0,maxl=0;
        while(j<nums.length){
            if(nums[j]==max)
            {
                len=j-indx+1;
                if(len>maxl){
                    maxl=len;
                }
            }
            else{
                indx=j+1;
            }
            j++;
        }
        return maxl;
    }
}