//https://leetcode.com/problems/arranging-coins/
//2021-10-29

public class Solution {

    //Runtime: 7 ms, faster than 34.91% of Java online submissions for Arranging Coins.
    //Memory Usage: 36.5 MB, less than 48.62% of Java online submissions for Arranging Coins.
    public int arrangeCoins(int n){
        int count = 1;
        int answer = 0;

        while(n - count >= 0){
            n -= count;
            count++;
            answer++;
        }
        return answer;
    }

}
 /*
    *
    //Time Limit Exceeded
    public int arrangeCoins_timeLimitExceeded(int n){
        int answer = 0;
        while(!(n >= sumOfAll(answer - 1) && n < sumOfAll(answer))){
            answer++;
        }
        return answer - 1;
    }
    //Int maximum exceed
    public int arrangeCoins(int n){
        return  (1 + (int)Math.sqrt(1 + 8 * n)) / 2 - 1;
    }
    public int sumOfAll(int n){
        if(n % 2 == 0){
            return (n / 2) * (n + 1);
        } else{
            return n * ((n + 1) / 2);
        }
    }
    * */