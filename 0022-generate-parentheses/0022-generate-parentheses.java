class Solution {
    public List<String> ls = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backans("",0,0,n);
        return ls;
    }
    public void backans(String str,int open,int close,int n){
        if(str.length()==2*n){
            ls.add(str);
            return;
        }
        if(open<n){
            backans(str+"(",open+1,close,n);
        }
        if(close<open){
            backans(str+")",open,close+1,n);
        }
    }
}