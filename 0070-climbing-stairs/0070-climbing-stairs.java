// class Solution {
//     public int climbStairs(int n) {
// 		if (n <= 2)
// 			return n;
// 		return  climbStairs(n-1) + climbStairs(n-2);
// 	}
// 	public int countWays(int s)
// 	{
// 		return climbStairs(s);
// 	}
// }

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public int solve(int n, int[] dp) {
        if (n <= 1)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
        return dp[n];
    }
}
