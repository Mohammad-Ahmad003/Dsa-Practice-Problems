class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        for(int i=0;i<fruits.length;i++){
            int target=fruits[i];
            for(int j=0;j<baskets.length;j++){
                if(target<=baskets[j]){
                    baskets[j]=0;
                    c++;
                    break;
                }
            }
        }
        return fruits.length-c;
    }
}