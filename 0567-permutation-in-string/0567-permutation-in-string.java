class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(equal(s1,s2.substring(i,i+s1.length())) ){
                return true;
            }
        }
        return false;
        
    }
    public boolean equal(String s1,String sub){
        int freq[] = new int [26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[sub.charAt(i)-'a']--;

        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
            freq[i]=0;
        }
        return true;
    } 
}