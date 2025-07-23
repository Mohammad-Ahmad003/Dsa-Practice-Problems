class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x >= y) {
            int score1 = gainFromPattern(s, "ab", x);
            String leftover = buildLeftover(s, "ab");
            int score2 = gainFromPattern(leftover, "ba", y);
            return score1 + score2;
        } else {
            int score1 = gainFromPattern(s, "ba", y);
            String leftover = buildLeftover(s, "ba");
            int score2 = gainFromPattern(leftover, "ab", x);
            return score1 + score2;
        }
    }

    private int gainFromPattern(String s, String pattern, int val) {
        StringBuilder sb = new StringBuilder();
        int score = 0;
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            int len = sb.length();
            if (len >= 2 && sb.charAt(len - 2) == pattern.charAt(0) && sb.charAt(len - 1) == pattern.charAt(1)) {
                sb.delete(sb.length() - 2, sb.length());
                score += val;
            }
        }
        return score;
    }

    private String buildLeftover(String s, String pattern) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            int len = sb.length();
            if (len >= 2 && sb.charAt(len - 2) == pattern.charAt(0) && sb.charAt(len - 1) == pattern.charAt(1)) {
                sb.delete(sb.length() - 2, sb.length());
            }
        }
        return sb.toString();
    }
}
