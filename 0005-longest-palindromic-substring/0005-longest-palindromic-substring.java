class Solution {
    public String longestPalindrome(String s) {
        String large="";
        for(int i=0;i<s.length();i++){
            String s1=isPalin(i,i,s);
            
            if(s1.length()>large.length()){
                large=s1;
            }
            String s2=isPalin(i,i+1,s);
            if(s2.length()>large.length()){
                large=s2;
            }
        }
        return large;

    }
    public String isPalin(int i,int j , String s){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}