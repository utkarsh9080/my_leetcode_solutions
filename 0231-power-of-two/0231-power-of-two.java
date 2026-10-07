class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n%2!=0||n==0) return false;
        return check(n);
    }
    public static boolean check(int n){
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        n=n/2;
        return check(n);
    }
}