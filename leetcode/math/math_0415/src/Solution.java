//https://leetcode.com/problems/add-strings/
//2021-10-28

public class Solution {
    //Runtime: 2 ms, faster than 94.03% of Java online submissions for Add Strings.
    //Memory Usage: 39.3 MB, less than 60.31% of Java online submissions for Add Strings.
    public String addStrings(String num1, String num2){
        StringBuilder answer = new StringBuilder();
        StringBuilder longer =
                new StringBuilder(num1.length() >= num2.length() ? num1 : num2);
        StringBuilder shorter =
                new StringBuilder(num1.length() < num2.length() ? num1 : num2);

        longer = longer.reverse();
        shorter = shorter.reverse();

        int max = shorter.length();
        int intSum;
        int carry = 0;
        int intConstant = '0';

        for(int i = 0; i < max; i++){
            intSum =
                    longer.charAt(i) + shorter.charAt(i) - (2 * intConstant) + carry;
            answer.append(intSum % 10);
            carry = intSum / 10;
        }
        for(int i = max; i < longer.length(); i++){
            intSum = longer.charAt(i) - intConstant + carry;
            answer.append(intSum % 10);
            carry = intSum/10;
        }
        answer.append(carry);
        return answer.reverse().toString();
    }
}
