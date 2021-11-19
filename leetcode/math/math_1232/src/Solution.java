//https://leetcode.com/problems/check-if-it-is-a-straight-line/
//2021-11-19

public class Solution {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If It Is a Straight Line.
    //Memory Usage: 38.8 MB, less than 33.54% of Java online submissions for Check If It Is a Straight Line.
    public boolean checkStraightLine(int[][] coordinates){
        boolean isVertical = false;
        double slope;
        double dx = coordinates[0][0] - coordinates[1][0];
        double dy = coordinates[0][1] - coordinates[1][1];
        if(dx == 0 ) isVertical = true;
        slope = dy / dx;
        double k;

        for(int i = 1; i < coordinates.length - 1; i++){
            dx = coordinates[i][0] - coordinates[i + 1][0];
            dy = coordinates[i][1] - coordinates[i + 1][1];
            k = slope - (dy / dx);
            if(isVertical && dx != 0) return false;
            else if(!isVertical && (k > 0.00001 || k < -0.00001)) return false;
        }
        return true;
    }
}
