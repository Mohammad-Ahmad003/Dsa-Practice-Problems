class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int minIndx=0;
        int maxIndx=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndx=i;
            }
        }
        if(minIndx>maxIndx){
            int temp=maxIndx;
            maxIndx=minIndx;
            minIndx=temp;
        }
        int front=maxIndx+1;
        int back=n-minIndx;
        int both=(minIndx+1)+(n-maxIndx);
        return Math.min(front,Math.min(back,both));
    }
}