class Solution {
    public boolean isSubsequence(String s, String t) {
        int spt=0;int tpt=0;
        int ct=0;
        while(tpt<t.length() && spt<s.length()){
            if(t.charAt(tpt)==(s.charAt(spt))){
                ct++;
                spt++;
            }
            tpt++;
        }
        return spt==s.length()?true:false;
    }
}