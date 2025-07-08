class Solution {
    public int countGoodSubstrings(String s) {
        
        int len = s.length();

        if(len<3){
            return 0;
        }
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(i>=3){
                char remelem=s.charAt(i-3);
                map.put(remelem,map.get(remelem)-1);
                if(map.get(remelem)==0){
                    map.remove(remelem);
                }
            }

            if(i>=2 && map.size()==3){
                count++;
            }

        }
        return count;
    }
}