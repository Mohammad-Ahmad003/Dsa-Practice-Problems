class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int hash[]= new int[26];
        int len = answerKey.length();
        // int tcount=0;
        // int fcount=0;
        // int m=Integer.MAX_VALUE;
        // for(char ch:answerKey.toCharArray()){
        //     if(ch=='T'){
        //         tcount++;
        //     }
        //     else{
        //         fcount++;
        //     }
        //     m=Math.min(tcount,fcount);
        //     if(m>k){
        //         return fcount+tcount-1;
        //     }
        // }
        // return tcount+fcount;
        int l=0;
        int r=0;
        int mlen =0;
        int mfreq=0;

        while(r<len){
            char ch = answerKey.charAt(r);
            hash[ch-'A']++;
            mfreq=Math.max(mfreq,hash[ch-'A']);
            int changes = r-l+1 - mfreq;
            if(changes>k){
                char c = answerKey.charAt(l);
                hash[c-'A']--;
                l++;
            }
            mlen = Math.max(mlen,r-l+1);
            r++;
        }
        return mlen;
    }
}