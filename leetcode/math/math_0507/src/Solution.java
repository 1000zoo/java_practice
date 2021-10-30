//https://leetcode.com/problems/perfect-number/
//2021-10-30

public class Solution {
    //Runtime: 2704 ms, faster than 17.14% of Java online submissions for Perfect Number.
    //Memory Usage: 35.8 MB, less than 68.69% of Java online submissions for Perfect Number.
    public boolean myCheckPerfectNumber(int num){
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0) sum += i;
            if(sum > num) return false;
        }
        return sum == num;
    }

    //Referenced by
    //https://leetcode.com/problems/perfect-number/discuss/1448311/Java-2ms-O(sqrt(n))-accepted-solution

    //Runtime: 1 ms, faster than 96.57% of Java online submissions for Perfect Number.
    //Memory Usage: 35.8 MB, less than 68.69% of Java online submissions for Perfect Number.
    public boolean checkPerfectNumber(int num){
        if(num == 1) return false;
        int sum = 1;
        for(int i = 2; i <= (int)Math.sqrt(num); i++)
            if(num % i == 0) sum += i + num / i;

        return sum == num;
    }
}
