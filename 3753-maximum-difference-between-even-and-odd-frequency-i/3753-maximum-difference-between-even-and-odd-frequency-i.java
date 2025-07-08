class Solution {
    public int maxDifference(String s) {
        int freq[] = new int[26];
        int mineven=Integer.MAX_VALUE;
        int maxodd=0;;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]%2==0 && freq[i]<mineven && freq[i] != 0){
                mineven=freq[i];
            }
            else if(freq[i]%2!=0 && freq[i]>maxodd){
                maxodd=freq[i];
            }
        }
        return maxodd-mineven;
        
    }
}