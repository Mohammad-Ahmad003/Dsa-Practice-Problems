class Solution {
    public int countHillValley(int[] nums) {
        int left=nums[0];
        int hill=0;
        int valley=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>left && nums[i]>nums[i+1]){
                hill++;
                left=nums[i];
            }
            if(nums[i]<left && nums[i]<nums[i+1]){
                valley++;
                left=nums[i];
            }
            // else if(nums[i]!=left){
            //     left=nums[i];
            // }
        }
        return hill+valley;
    }
}