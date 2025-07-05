class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
       //ArrayList<ArrayList<String>> al = new ArrayList<>(); 
       HashMap<String,List<String>> map = new HashMap<>();

        String str[]= new String[strs.length];
        for(String words:strs){
            char ch[]=words.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(words);
        }
        return new ArrayList<>(map.values());

    }
}