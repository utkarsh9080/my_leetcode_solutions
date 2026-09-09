class Solution {
    public long countCommas(long n) {
        // 1st comma at 1,000 2nd at 1,000,000 and 3rd at 1,000,000,000
        long p =1000,res=0;
        while(p<=n){
            res+=n-p+1;
            p*=1000;
        }
        return res;
    }
}