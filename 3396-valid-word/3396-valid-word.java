class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)return false;
        int vc=0,cc=0,dig=0,alphanum=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
           if(isVowel(ch)){
            vc++;
           }
           else if(isConsonant(ch)){
            cc++;
           }
           else if(ch>='0' && ch<='9'){
            dig++;
           }
           else if(ch=='@' || ch=='#'||ch=='$'){
            alphanum++;
           }
        }
        if(vc>0 && cc>0 && (dig>=0 && alphanum==0 )){
            return true;
        }
        return false;
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'a' && ch <= 'z' && !isVowel(ch);
    }
}