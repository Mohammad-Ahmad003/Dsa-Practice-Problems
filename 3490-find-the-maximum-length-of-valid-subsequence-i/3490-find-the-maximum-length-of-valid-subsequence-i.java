class Solution {
    public int maximumLength(int[] nums) {
        int evenCount = 0, oddCount = 0;
        int arr[]= new int[nums.length];
        for(int j=0;j<nums.length;j++){
            arr[j]=nums[j]%2;
            if(arr[j]==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        int len=0;
        int evenSumSubseq = Math.max(evenCount, oddCount);      // same parity → even sum
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                len++;
            }
        }
        // int oddSumSubseq = Math.min(evenCount, oddCount) * 2;   // alternating → odd sum

        return Math.max(evenSumSubseq, len+1);
    }
}
