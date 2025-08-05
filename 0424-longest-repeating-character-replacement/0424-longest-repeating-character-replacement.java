class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int mlen =0;
        int l=0,r=0;
        int maxf=0;
        int hash[]= new int[26];
        while(r<len){
            char ch = s.charAt(r);
            hash[ch-'A']++;
            maxf=Math.max(maxf,hash[ch-'A']);
            int no_changes = r-l+1 - maxf;
            if(no_changes>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            mlen=Math.max(r-l+1,mlen);
            r++;
        }
        return mlen;
    }
}