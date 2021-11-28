//https://leetcode.com/problems/counting-bits/submissions/
//2021-11-28

import java.util.ArrayList;
import java.util.Iterator;

public class Faster {
    //Runtime: 5 ms, faster than 24.34% of Java online submissions for Counting Bits.
    //Memory Usage: 43.5 MB, less than 40.21% of Java online submissions for Counting Bits.
    public int[] countBits(int n){
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> mid = new ArrayList<>();
        Iterator<Integer> it;
        temp.add(0);
        pre.add(0);
        int pow = 0;
        while(Math.pow(2, pow + 1) < n) pow++;
        int res = n - (int) Math.pow(2, pow);
        boolean isPow = n == (int) Math.pow(2, pow + 1);

        for(int i = 0; i < pow; i++){
            it = pre.iterator();
            while(it.hasNext()){
                mid.add(it.next() + 1);
            }
            temp.addAll(mid);
            pre = temp;
            ArrayList<Integer> nul = new ArrayList<>();
            mid = nul;
        }
        it = isPow ? pre.subList(0, res).iterator() : pre.subList(0, res + 1).iterator();
        while(it.hasNext()) mid.add(it.next() + 1);
        temp.addAll(mid);
        if(isPow) temp.add(1);

        int[] ans = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            ans[i] = temp.get(i);
        }
        return ans;
    }
}


//using iterator
// Iterator<Integer> it;
//*        for(int i = 0; i < pow; i++){
//            it = temp.iterator();
//            while(it.hasNext()){
//                temp.add(it.next() + 1);
//            }
//        }
//*        it = temp.subList(0, res).iterator();
//        while(it.hasNext()) temp.add(it.next() + 1);
