//https://leetcode.com/problems/plus-one/submissions/
//2021-10-21

import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] carry = new int[digits.length + 1];
        int index_max = digits.length;
        carry[index_max] = 1;

        for(int i = 0; i < index_max; i++){
            if(digits[index_max - i - 1] + carry[index_max - i] > 9){
                carry[index_max - i - 1] = 1;
                temp.add(0);
                if(i == index_max - 1){
                    temp.add(1);
                }
            } else{
                temp.add(digits[index_max - i - 1] + carry[index_max - i]);
            }
        }

        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(temp.size() - i - 1);
        }
        return answer;
    }
}