class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder st = new StringBuilder();
        for(int i=parts.length-1;i>=0;i--){
            st.append(parts[i]);
            if(i!=0){
                st.append(" ");
            }
        }
        return st.toString();
    }
}