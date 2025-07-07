class Solution {
    public int reverseDegree(String s) {
        int len = s.length();
        int sum=0;
        for(int i =0;i<len;i++){
            // int indx=s.charAt(i)-'a'+1;
            int revVal='z'-s.charAt(i)+1;
            sum+=(i+1)*revVal;
        }
        return sum;
    }
}