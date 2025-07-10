class Solution {
    public int countDistinctIntegers(int[] nums) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    public int reverse(int n){
        int ogval=n;
        int newval=0;
        int val=0;
        while(n>0){
            newval=newval*10+n%10;
            n/=10;
        }
        return newval;

    }
}