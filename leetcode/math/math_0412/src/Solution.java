//https://leetcode.com/problems/fizz-buzz/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //Runtime: 1 ms, faster than 99.69% of Java online submissions for Fizz Buzz.
    //Memory Usage: 40.2 MB, less than 65.38% of Java online submissions for Fizz Buzz.
    public List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) answer.add("FizzBuzz");
            else if(i % 3 == 0) answer.add("Fizz");
            else if(i % 5 == 0) answer.add("Buzz");
            else answer.add(String.valueOf(i));
        }

        return answer;
    }
}
