//https://leetcode.com/problems/add-digits/
//2021-10-24

public class Solution {

    //Runtime: 3 ms, faster than 16.97% of Java online submissions for Add Digits.
    //Memory Usage: 38.1 MB, less than 41.93% of Java online submissions for Add Digits.
    public int addDigits(int num){
        int sum = 0;

        while(num / 10 > 0){
            sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
