//https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
//2021-11-10

//problem of greatest common factor

import java.util.*;

public class Solution {
    //Runtime: 5 ms, faster than 86.51% of Java online submissions for X of a Kind in a Deck of Cards.
    //Memory Usage: 39.8 MB, less than 41.96% of Java online submissions for X of a Kind in a Deck of Cards.
    public boolean hasGroupsSizeX(int[] deck){
        boolean[] isContains = new boolean[10001];
        ArrayList<Integer> sizeList = new ArrayList<>();
        HashMap<Integer, Integer> sizeMap = new HashMap<>();
        int gcd__ = 1;

        for(int i : deck){
            sizeMap.put(i, sizeMap.getOrDefault(i, 0) + 1);
        }
        for(int i : deck){
            if(!isContains[i]){
                if(sizeMap.get(i) < 2) return false;
                isContains[i] = true;
                sizeList.add(sizeMap.get(i));
            }
        }
        for(int i = 0; i < sizeList.size() - 1; i++){
            gcd__ = gcd(sizeList.get(i), sizeList.get(i + 1));
            if(gcd__ == 1) return false;
        }
        return true;
    }

    private int gcd(int a, int b){
        if(b > a){
            int temp = b;
            b = a;
            a = temp;
        }

        if(a % b == 0){
            return b;
        } else return gcd(b, a % b);
    }
}
