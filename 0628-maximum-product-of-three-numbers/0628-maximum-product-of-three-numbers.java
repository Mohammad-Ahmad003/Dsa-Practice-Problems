class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int negprod=Integer.MIN_VALUE;
        int len =nums.length;
        negprod=(nums[0]*nums[1]*nums[len-1]);
        
        int prod=nums[len-1]*nums[len-2]*nums[len-3];
        return negprod>prod?negprod:prod;
    }
}