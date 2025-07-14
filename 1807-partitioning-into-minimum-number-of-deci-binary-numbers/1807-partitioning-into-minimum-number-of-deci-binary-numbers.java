class Solution {
    public int minPartitions(String n) {
        int num=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)>num){
                num=n.charAt(i);
            }
        }
        return num-'0';
    }
}