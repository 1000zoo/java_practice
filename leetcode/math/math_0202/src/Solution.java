//https://leetcode.com/problems/happy-number/
//2021-10-24

public class Solution {
    public boolean isHappy(int n) {
        int sum;
        int ans;

        do {
            sum = 0;
            while(n > 0){
                sum += Math.pow((n % 10), 2);
                n /= 10;
            }
            n = sum;
            ans =zeroDominate(n);
        } while (ans == -1);

        return ans == 1;
    }

    public int zeroDominate(int n) {
        int cnt = 0;
        int exceptionCnt = 0;
        while (n > 0) {
            if (n % 10 != 0 && n % 10 != 1 && n % 10 != 7) {
                cnt++;
            } else if (n % 10 == 1 || n % 10 == 7) {
                exceptionCnt++;
            }
            n /= 10;
        }
        if (cnt + exceptionCnt >= 2) return -1; //not end
        else if (exceptionCnt == 1) return 1; //end, return true
        else return 0; //end, return false
    }
}
