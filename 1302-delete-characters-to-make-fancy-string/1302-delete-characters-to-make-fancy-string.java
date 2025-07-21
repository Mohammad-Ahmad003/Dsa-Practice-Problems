class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(sb.length()<2 || ch!=sb.charAt(sb.length()-1) || ch!=sb.charAt(sb.length()-2)){
                sb.append(ch);
            }
        }
        
        
        return sb.toString();
    }
}