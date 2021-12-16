//Referenced by
//https://leetcode.com/problems/counting-bits/discuss/1597209/3ms-O(N)-JAVA-DP-solution

public class BestSolution {
    public int[] countBits(int n){
        int[] res = new int[n + 1];
        res[0] = 0;
        for(int i = 1; i <= n; i++){
            res[i] = i % 2 + res[i / 2];
        }
        return res;
    }
}
