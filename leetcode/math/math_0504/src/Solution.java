//https://leetcode.com/problems/base-7/
//2021-10-30

public class Solution {
    //Runtime: 1 ms, faster than 92.42% of Java online submissions for Base 7.
    //Memory Usage: 36.7 MB, less than 60.44% of Java online submissions for Base 7.
    public String convertToBase7(int num){
        if(num == 0) return "0";
        boolean negative = false;
        StringBuilder ansB = new StringBuilder();
        if(num < 0){
            negative = true;
            num *= -1;
        }
        while(num != 0){
            ansB.append(num % 7);
            num /= 7;
        }
        if(negative) ansB.append('-');
        return ansB.reverse().toString();
    }
}
