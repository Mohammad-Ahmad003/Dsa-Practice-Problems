class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        int gcd=1;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){

                gcd=i;
            }
        }
        return gcd;
    }
}