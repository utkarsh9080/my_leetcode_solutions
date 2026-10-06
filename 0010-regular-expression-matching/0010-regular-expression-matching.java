class Solution {
    public boolean isMatch(String s, String p) {
        return match(0, 0, s, p);
    }
    public boolean match(int i, int j, String s, String p) {
        if (j == p.length()) {
            return i == s.length();
        }
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            return match(i, j + 2, s, p) ||
                   (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') && match(i + 1, j, s, p));
        }
        if (i < s.length() &&
            (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
            return match(i + 1, j + 1, s, p);
        }
        return false;
    }
}