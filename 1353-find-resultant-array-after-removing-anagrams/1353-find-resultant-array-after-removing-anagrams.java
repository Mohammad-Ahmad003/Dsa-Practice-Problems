class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> list = new ArrayList<>();

        String prevsorted="";
        for(String word:words){
            
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String sorted= new String(ch);
            if(!(sorted.equals(prevsorted))){
                list.add(word);
                prevsorted=sorted;
            }
        }
        return list;
    }
}