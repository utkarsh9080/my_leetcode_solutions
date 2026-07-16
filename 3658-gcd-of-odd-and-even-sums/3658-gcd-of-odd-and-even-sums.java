class Solution {
    public int gcdOfOddEvenSums(int n) {
        // retry okokoko????????/
        int odd = (n*(2+(n-1)*2))/2;
        int eve = (n*(4+(n-1)*2))/2;
        while (odd!=0){
            int t = odd;
            odd=eve%odd;
            eve=t;
        }
        return eve;
    }
};