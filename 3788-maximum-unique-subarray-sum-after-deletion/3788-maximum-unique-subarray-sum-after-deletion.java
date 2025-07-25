class Solution {
    public int maxSum(int[] nums) {
        int maxsum=0;
        int sum=0;
        int maxneg=Integer.MIN_VALUE;
        if(nums.length==1) return nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) {
                set.add(nums[i]);
            }
            if(nums[i]>maxneg){
                maxneg=nums[i];
            }
            
        }
        for(int num : set){
            maxsum+=num;
        }
        return maxsum==0?maxneg:maxsum;


    }
}