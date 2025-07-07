class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int posarr[]= new int[len/2];
        int negarr[]= new int[len/2];
        int pind=0;
        int nind=0;
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                negarr[nind]=nums[i];
                nind++;
            }
            else{
                posarr[pind]=nums[i];
                pind++;
            }
        }
        //int flag=1;
        nind=0;
        pind=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                nums[i]=posarr[pind];
                pind++;
            }
            else{
                nums[i]=negarr[nind];
                nind++;
            }
        }
        return nums;
    
    }
}