class Solution {
    public int missingInteger(int[] nums) {
        //map se mza nahi ayega isse krtei hai
        int freq[]=new int[51];
        freq[nums[0]]++;
        int currsum=nums[0];
        int maxsum=currsum;
        
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]<1)
                freq[nums[i]]++;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                currsum+=nums[i];
            }
            else{
                break;
            }
        }
        int value=0;
        int sum=50*51/2;
        for(int i=currsum;i<=sum;i++){
            if(i>50){
                value = i;
                break;
            }
            if(freq[i]==0){
                value=i;
                break;
            }
        }
        return value;
    }
}