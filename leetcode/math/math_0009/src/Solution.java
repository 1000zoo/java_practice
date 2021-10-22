//https://leetcode.com/problems/palindrome-number/submissions/
//2021-10-21

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(int x){
        if(x < 0) return false;
        ArrayList<Integer> temp = new ArrayList<>();
        while(x > 0){
            temp.add(x%10);
            x /= 10;
        }
        for(int i = 0; i < temp.size() / 2; i++){
            if(!temp.get(i).equals(temp.get(temp.size() - i - 1))){
                return false;
            }
        }
        return true;
    }
}
