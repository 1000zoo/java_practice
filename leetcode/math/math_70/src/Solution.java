//https://leetcode.com/problems/climbing-stairs/
//2021-10-21

public class Solution {

    //reference
    //https://minhamina.tistory.com/38
    //Time Limit Exceeded
    public int nCr(int n, int r){
        if(n == r || r == 0){
            return 1;
        } else{
            return nCr(n - 1, r - 1) + nCr(n - 1, r);
        }
    }
    //reference
    //https://leetcode.com/problems/climbing-stairs/discuss/1533014/Java-solution-with-explanation
    public int getCombinations (int n, int r){
        double temp = 1;
        for (int i = 2; i <= n; i++) {
            temp *= i;
            if (i <= r) temp /= i;
            if (i <= (n - r)) temp /= i;
        }
        return (int) Math.round(temp);
    }

    public int climbStairs(int n){
        int answer = 0;
        int oneCnt = n;
        int twoCnt = 0;
        while(n >= 0){
            answer = answer + getCombinations(oneCnt + twoCnt, twoCnt);
            n = n - 2;
            oneCnt -= 2;
            twoCnt += 1;
        }
        return answer;
    }

    /*
    * Time Limit Exceeded
    public int climbStairs(int n){
        return dfs(n, 0);
    }
    private int dfs(int n, int stairs){
        int count = 0;
        if(stairs > n) return 0;
        else if(stairs == n) return 1;
        else{
            count += dfs(n, stairs + 1);
            count += dfs(n, stairs + 2);
        }
        return count;
    }
    */
}
