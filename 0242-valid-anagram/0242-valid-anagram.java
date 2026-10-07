class Solution {
    public boolean isAnagram(String s, String t) {
       ArrayList<Character> a= new ArrayList<>();
       ArrayList<Character> b= new ArrayList<>();
       if(s.length()!=t.length()){
        return false;
       }
       for(int i=0;i<s.length();i++){
        a.add(s.charAt(i));
        b.add(t.charAt(i));
       }
       Collections.sort(a);
       Collections.sort(b);
       if(a.equals(b)){
        return true;
       }
       else{
        return false;
       }
    }
}