class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                k++;
                nums[k]=nums[i];
                count++;
            }
        }
        return count;
    }
}