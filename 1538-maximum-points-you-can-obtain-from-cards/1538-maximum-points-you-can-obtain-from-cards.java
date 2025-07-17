class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int winsum=0;
        for(int i=0;i<k;i++){
            winsum+=cardPoints[i];
        }
        int maxsum=winsum;
        int n=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            winsum=winsum-cardPoints[i]+cardPoints[n];
            maxsum=Math.max(maxsum,winsum);
            n--;
        }
        return maxsum;
    }
}