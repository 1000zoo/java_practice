//https://leetcode.com/problems/power-of-three/
//2021-10-28

class Solution {
    //Runtime: 11 ms, faster than 76.33% of Java online submissions for Power of Three.
    //Memory Usage: 39 MB, less than 52.12% of Java online submissions for Power of Three.
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n > 0){
            if(n != 1 && n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }


    //Runtime: 11 ms, faster than 76.33% of Java online submissions for Power of Three.
    //Memory Usage: 39.1 MB, less than 49.53% of Java online submissions for Power of Three.
    public boolean pot(int n){
        if(n <= 0) return false;
        double a = Math.log(n);
        double b = Math.log(3);
        double temp = a/b;
        int t = (int) Math.round(temp);
        return Math.abs(t - temp) < 0.0000000001;
        //referenced by
        //https://leetcode.com/problems/power-of-three/discuss/1493930/JAVA-or-100.00-ms-or-LOGRATHMIC
    }
}