//https://leetcode.com/problems/sqrtx/submissions/
//2021-10-22

import java.util.Random;

public class Solution {

    public int mySqrt(int x){
        if(x >= 2147395600) return 46340; //TT
        int randMin = 0;
        int randMax = 46339; //sqrt(int max) + 1
        if(x > Math.pow(20000, 2)) randMin = 20000;
        else randMax = 20000;
        Random random = new Random();
        int rand = random.nextInt(randMax - randMin + 1) + randMin;
        while(!(Math.pow(rand, 2) < x && Math.pow(rand + 1, 2) >= x)) {
            if(Math.pow(rand, 2) > x) randMax = rand;
            else randMin = rand;
            rand =  random.nextInt(randMax - randMin + 1) + randMin;
        }

        return rand;
    }


    //too slow
    public int slowSqrt(int x){
        if(x == 0) return 0;
        int i = 2;
        while(x / i > i){
            i++;
        }
        if(x / i != i) i -= 1;
        return i;
    }
    /*
    didn't work when x > 2147395599
    int max = 2147483647
    => 46341 * 46341 > max
    * public int mySqrt(int x){
        int i = 1;
        for(;(i + 1) * (i + 1) < x; i++);
        return i;
    }

    *
    public int mySqrt(int x){
        return (int)Math.sqrt(x);
    }
    */
}
