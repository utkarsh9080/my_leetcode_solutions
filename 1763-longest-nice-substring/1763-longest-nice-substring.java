class Solution {
    public String longestNiceSubstring(String s) {
        return solve(s, 0, s.length() - 1);
    }
    public String solve(String s, int left, int right) {
        if (left >= right) {
            return "";
        }
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for (int i = left; i <= right; i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }
        for (int i = left; i <= right; i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                if (!upper[c - 'a']) {
                    String leftPart = solve(s, left, i - 1);
                    String rightPart = solve(s, i + 1, right);
                    return leftPart.length() >= rightPart.length()
                           ? leftPart : rightPart;
                }
            } else {
                if (!lower[c - 'A']) {
                    String leftPart = solve(s, left, i - 1);
                    String rightPart = solve(s, i + 1, right);
                    return leftPart.length() >= rightPart.length()
                           ? leftPart : rightPart;
                }
            }
        }
        return s.substring(left, right + 1);
    }
}