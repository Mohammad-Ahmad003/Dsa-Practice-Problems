class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        int gen[]=new int[26];
        for(String b:words2){
             int countB[]=new int[26];
            for(char ch:b.toCharArray()){
                countB[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                gen[i]=Math.max(gen[i],countB[i]);
            }
        }
        
        for(String a:words1)
        {
            int countA[]=new int[26];
            for(char c:a.toCharArray()){
                countA[c-'a']++;
            }
            boolean val=true;
            for(int i=0;i<26;i++){
                if(countA[i]<gen[i]){
                    val=false;
                    break;
                }
            }
            if(val) list.add(a);
            val=true;
        }
        return list;
    }
}