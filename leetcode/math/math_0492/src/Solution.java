//https://leetcode.com/problems/construct-the-rectangle/
//2021-10-30

import java.util.*;

public class Solution {

    //Runtime: 79 ms, faster than 12.67% of Java online submissions for Construct the Rectangle.
    //Memory Usage: 36.8 MB, less than 53.41% of Java online submissions for Construct the Rectangle.
    public int[] mySolution(int area){
        int w = 1;
        int l = area;

        HashSet<Integer> length = new HashSet<>();

        for(int i = 1; i <= area / 2; i++){
            if(area % i == 0 && !length.contains(area / i)){
                length.add(i);
                if(i == area / i){
                    l = i;
                    w = i;
                    break;
                }
            } else if(area % i == 0){
                l = i;
                w = area / l;
                break;
            }
        }
        return new int[] {l, w};
    }

    //Referenced by
    //https://leetcode.com/problems/construct-the-rectangle/discuss/1446064/Java-0-ms-faster-than-100.00

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Construct the Rectangle.
    //Memory Usage: 36.7 MB, less than 53.41% of Java online submissions for Construct the Rectangle.
    public int[] constructRectangle(int area){
        int w = (int) Math.sqrt(area);
        int l = area;
        while(w > 1){
            if(area % w == 0){
                l = area / w;
                break;
            }
            w--;
        }
        return new int[] {l, w};
    }
}
