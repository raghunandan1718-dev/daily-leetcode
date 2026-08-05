class Solution {
    public int climbStairs(int n) {
      int dp[] = new int[n+1];
        if(n<=2){
            return n;
        }
     dp[1] = 1;
     dp[2] = 2;

     for(int curr =3; curr<=n; curr++){
        dp[curr] = dp[curr -1] + dp[curr -2];
     }
     return dp[n];

        
    }
}