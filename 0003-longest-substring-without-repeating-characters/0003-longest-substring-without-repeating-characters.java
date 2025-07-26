class Solution {
    public int lengthOfLongestSubstring(String s) {

        //solution works only for ascii small letter values;

        // int freq[]= new int [26];
        // int count=0;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<s.length();i++){
        //     if(freq[s.charAt(i)-'a']<1){
        //         freq[s.charAt(i)-'a']++;
        //     }
        //     else{
        //         count=0;
        //         // freq[s.charAt(i)-'a']--;
        //     }
        //     count++;
        //     max=Math.max(count,max);
        // }
        // return max;

        // HashSet<Character> set = new HashSet<>();
        // int right=0;int left=0;int maxlen=0;

        // while(right<s.length()){
        //     char c =s.charAt(right);
        //     if(!set.contains(c)){
        //         set.add(c);
        //         maxlen=Math.max(maxlen,right-left+1);
        //         right++;
        //     }
        //     else{
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        // } 
        // return maxlen;

        // int arr[] = new int[256];
        // int beg=0;
        // int len=0;
        // for(int i=0;i<s.length();i++){
        //     int ch=s.charAt(i);
        //     arr[ch]++;

        //     while(arr[ch]>1){
        //         arr[s.charAt(beg)]--;
        //         beg++;
        //     }
        //     len=Math.max(len,i-beg+1);

        // }
        // return len;

        int map[]=new int[256];
        for(int i=0;i<256;i++){
            map[i]=-1;
        }
        int l=0;int r=0,len=s.length();
        int slen=0;
        int maxlen=0;
        while(r<len){
            if(map[s.charAt(r)]!=-1){
                if(map[s.charAt(r)]>=l){
                    l=map[s.charAt(r)]+1;
                }
            }
            slen=r-l+1;
            maxlen=Math.max(slen,maxlen);
            map[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}