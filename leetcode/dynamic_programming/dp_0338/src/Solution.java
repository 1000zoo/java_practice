//https://leetcode.com/problems/counting-bits/submissions/
//2021-11-22

public class Solution {
    //Runtime: 21 ms, faster than 5.28% of Java online submissions for Counting Bits.
    //Memory Usage: 45.2 MB, less than 18.04% of Java online submissions for Counting Bits.
    public int[] countBits(int n){
        int[] ans = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            ans[i] = countOne(i);
        }
        return ans;
    }

    private int countOne(int n){
        int cnt = 0;
        while(n > 0){
            if(n % 2 == 1) cnt++;
            n /= 2;
        }
        return cnt;
    }
}
