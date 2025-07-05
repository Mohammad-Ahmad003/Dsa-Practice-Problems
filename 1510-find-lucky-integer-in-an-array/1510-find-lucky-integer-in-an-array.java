class Solution {
    public int findLucky(int[] arr) {
        //int freq[]= new int[501];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            {
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int luckyint=-1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value=entry.getValue();
            int key = entry.getKey();

            if(key==value){
                luckyint=Math.max(luckyint,value);
            }
        }
        return luckyint;
    }
}