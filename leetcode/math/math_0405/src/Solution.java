//https://leetcode.com/problems/convert-a-number-to-hexadecimal/submissions/
//2021-10-28

public class Solution {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert a Number to Hexadecimal.
    //Memory Usage: 36.5 MB, less than 67.86% of Java online submissions for Convert a Number to Hexadecimal.
    public String toHex(int num){
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();

        if(num < 0){
            num += 1;
            num *= -1;
            int digitCount = 8;
            while(num > 0){
                if(15 - (num % 16) < 10){
                    sb.append(15 - (num % 16));
                } else{
                    sb.append((char) ((15 - (num % 16)) + 'a' - 10));
                }
                num /= 16;
                digitCount--;
            }
            sb.append("f".repeat(Math.max(0, digitCount)));
        } else{
            while(num > 0){
                if(num % 16 < 10){
                    sb.append(num % 16);
                } else{
                    sb.append((char) ((num % 16) + 'a' - 10));
                }
                num /= 16;
            }
        }
        return sb.reverse().toString();
    }
}
