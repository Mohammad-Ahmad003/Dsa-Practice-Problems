class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gascount=0;
        int count=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
            gascount+=gas[i]-cost[i];
            count+=gas[i]-cost[i];
            if(count<0){
                start=i+1;
                count=0;
            }
        }
        return gascount>=0?start:-1;
    }
}