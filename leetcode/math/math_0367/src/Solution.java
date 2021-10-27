//https://leetcode.com/problems/valid-perfect-square/discuss/1542413/Simple-Java-Solution-or-0ms
//2021-10-28

public class Solution {
    //Runtime: 10 ms, faster than 5.02% of Java online submissions for Valid Perfect Square.
    //Memory Usage: 36 MB, less than 51.17% of Java online submissions for Valid Perfect Square.
    public boolean isPerfectSquare(int num){
        if(num == 1 || num == 4 || num == 9) return true;
        else if(num < 10) return false;
        int min = myPow((returnDigit(num) / 2) - 1);
        int max = myPow((returnDigit(num) / 2) + 1);
        for(int i = min; i <= max; i++){
            if((double) num / i == i) return true;
        }
        return false;
    }
    private int myPow(int p){
        if(p == 0) return 1;
        return 10 * myPow(p - 1);
    }
    private int returnDigit(int num){
        int cnt = 0;
        while(num > 0){
            cnt++;
            num /= 10;
        }
        return cnt;
    }
}
