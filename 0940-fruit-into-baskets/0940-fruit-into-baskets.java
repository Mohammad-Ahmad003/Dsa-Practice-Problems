class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,len=0,mlen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<fruits.length){
            int fruit=fruits[r];
            map.put(fruit,map.getOrDefault(fruit,0)+1);
            while(map.size()>2){
                int fruitl=fruits[l];
                map.put(fruitl,map.get(fruitl)-1);
                if(map.get(fruitl)==0){
                    map.remove(fruitl);
                }
                l++;
            }
            len=r-l+1;
            mlen=Math.max(len,mlen);
            r++;
        }
        return mlen;
    }
}