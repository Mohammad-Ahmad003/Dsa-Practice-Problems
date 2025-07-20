class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char ch;
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        List<Map.Entry<Character, Integer>>  entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b) -> b.getValue()- a.getValue());

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: entryList){
            char key = entry.getKey();
            int freq = entry.getValue();
            for(int i=0;i<freq;i++){
                sb.append(key);
            }
        }
        return sb.toString();

    }
}