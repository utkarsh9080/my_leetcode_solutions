class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        s1=new String(arr);
        int l = s1.length();
        for(int i=0;i<s2.length();i++){
            if(i+l>s2.length()){
                return false;
            }
            String sub = s2.substring(i,i+l);
            char[] a1 = sub.toCharArray();
            Arrays.sort(a1);
            sub=new String(a1);
            if(s1.equals(sub)){
                return true;
            }

        }
        return false;
    }
}