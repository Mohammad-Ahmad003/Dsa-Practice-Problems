class Solution {
    public int findLucky(int[] arr) {
        int freq[]= new int[501];
        int len=arr.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num:arr){
        //     {
        //         map.put(num,map.getOrDefault(num,0)+1);
        //     }
        // }
        // int luckyint=-1;
        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     int value=entry.getValue();
        //     int key = entry.getKey();

        //     if(key==value){
        //         luckyint=Math.max(luckyint,value);
        //     }
        // }
        for(int i=0;i<len;i++){
            freq[arr[i]]++;
        }
        for(int i=500;i>0;i--){
            if(freq[i]==i){
                return i;
            }
        }


        // return luckyint;

        return -1;
    }
}