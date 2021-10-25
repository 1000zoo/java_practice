//https://leetcode.com/problems/missing-number/submissions/
//2021-10-25

public class Solution {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
    //Memory Usage: 39.2 MB, less than 78.16% of Java online submissions for Missing Number.
    public int missingNumber(int[] nums){
        boolean[] check = new boolean[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            check[nums[i]] = true;
        }
        for(int i = 0; i < nums.length; i++){
            if(!check[i]) return i;
        }
        return nums.length;
    }
}
