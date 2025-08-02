class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        //,r=0,l=0,len=0;
        // HashMap<Character,Integer> map = new HashMap<>();
        // int seen[]={-1,-1,-1};
        // while(r<n){
        //     char ch = s.charAt(r);
        //     map.put(ch,r);
        //     if(map.size()==3){
        //         len+=s.length()-r;
        //         map.remove(s.charAt(l));
        //         l++;
        //     }
        //     r++;
        // }
        // int count=0;
        //int n = s.length();
        // for(int i=0;i<n;i++){
        //     int hash[]= {-1,-1,-1};
        //     for(int j=i;j<n;j++){
        //         char ch = s.charAt(j);
        //         hash[ch-'a']=1;
        //         if(hash[0]+hash[1]+hash[2]==3){
        //             count+=(n-j);
        //             break;
        //         }                 
        //     }
        // }
        // return count;
        int seen[]={-1,-1,-1};
        int len=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            seen[ch-'a']=i;
            if(seen[0]!=-1 && seen[1]!=-1 && seen[2]!=-1){
                int min=Math.min(seen[0],Math.min(seen[1],seen[2]));
                len+=min+1;
            }
        }
        return len;
    }
}