class Solution {
    public boolean digitCount(String num) {
        int freq[]= new int[10];
        int len = num.length();
        for(int i =0;i<len;i++){
            freq[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            int expecVal=num.charAt(i)-'0';
            if(expecVal!=freq[i]){
                return false;
            }
        }
        return true;

    }
}