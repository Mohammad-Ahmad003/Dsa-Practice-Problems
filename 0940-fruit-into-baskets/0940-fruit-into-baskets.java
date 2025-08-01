class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,len=0,maxl=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<fruits.length){
            int fruit=fruits[r];
            map.put(fruit,map.getOrDefault(fruit,0)+1);
            if(map.size()>2){
                int lfruit=fruits[l];
                map.put(lfruit,map.get(lfruit)-1);
                if(map.get(lfruit)==0){
                    map.remove(lfruit);
                }l++;
            }
            if(map.size()<=2){
                len=r-l+1;
                maxl=Math.max(len,maxl);
            }
            r++;
        }
        return maxl;
    }
}