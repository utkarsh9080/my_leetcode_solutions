class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        for(int i = str2.length(); i > 0; i--) {
            String s = str2.substring(0, i);
            if(str1.length() % i != 0 || str2.length() % i != 0)
                continue;
            if(s.repeat(str1.length()/i).equals(str1) &&
               s.repeat(str2.length()/i).equals(str2)) {
                return s;
            }
        }
        return "";
    }
}