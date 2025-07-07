class Solution {
    public int[] transformArray(int[] nums) {
        //int freq[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
               // freq[nums[i]]++;
            }
            else{
                nums[i]=1;
             //    freq[nums[i]]++;
            }
        }
        int st=0;int end=nums.length-1;int temp=0;
        while(st<=end){
            if(nums[st]==0){
                st++;
            }
            else if (nums[end]==1){
                end--;
            }
            else{
                temp=nums[end];
                nums[end]=nums[st];
                nums[st]=temp;
                st++;
                end--; 
            }
            
        }
        //  Arrays.sort(nums);
        return nums;
        
    }
}