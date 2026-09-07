// class Solution {
//     int n;
//         Set<String> st = new HashSet<>();
//         int[] dp = new int[2001];
//         void solve(int i,String temp,String s){
//             if(i==n){
//                 if(temp.length()>0) st.add(temp);
//                 return;
//             }
//             solve(i+1,temp+s.charAt(i),s);
//             solve(i+1,temp,s);
//         }
        
//     public int distinctSubseqII(String s) {
//         n=s.length();
//         solve(0,"",s);
//         return st.size();
//     }
// }
// FUCK THIS PROBLEM 
class Solution {
    int M = 1000000007;
    int[] dp = new int[2001];
    int[] prev; //prev[n] = last time when we saw this nth character (1-based indexing)
    public int distinctSubseqII(String s) {
        int n = s.length();
        Arrays.fill(dp, -1);
        prev = new int[n+1];
        int[] lastSeen = new int[26];
        for(int i = 1; i <= n; i++) {
            int idx = s.charAt(i-1) - 'a';
            prev[i] = lastSeen[idx];
            lastSeen[idx] = i;
        }
        dp[0] = 1; //if(n == 0) return 1;
        for(int i = 1; i <= n; i++) {
            int total = (int)(2L * dp[i-1] % M);
            if(prev[i] != 0) {
                int duplicates = dp[prev[i] - 1];
                total = (total - duplicates + M) % M;
            }
            dp[i] = total;
        }
        return (dp[n] - 1 + M) % M;
    }
}