class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int beg = 1;
        int maxgap = Integer.MIN_VALUE;
        int presum = 0;
        int len = startTime.length;

        //to save diff we need 1 extra size
        int diff[] = new int[len + 1]; 

        diff[0] = startTime[0] - 0;
        while (beg < len) {
            diff[beg] = startTime[beg] - endTime[beg - 1];
            beg++;
        }
        diff[len] = eventTime - endTime[len - 1]; 

        // window size 
        int windowSize = k + 1;
        for (int i = 0; i < windowSize; i++) {
            presum += diff[i];
        }

        int winsum = presum;
        for (int i = windowSize; i < diff.length; i++) {
            winsum += diff[i] - diff[i - windowSize];  
            presum = Math.max(presum, winsum);
        }

        return presum;
    }
}
