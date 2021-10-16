import java.util.Arrays;
import java.util.Collections;

public class Start {
    public static void main(String[] args){
        int[] ar = new int[] {3, 42, 21, 54, 542, 547,33, 3322, 332211, 332212};
        String[] st = new String[ar.length];
        for(int i = 0; i < ar.length; i++){
            st[i] = Integer.toString(ar[i]);
        }
        Arrays.sort(st, Collections.reverseOrder());
        System.out.println(Arrays.toString(st));
    }
}
/*
* 42, 363, 351, 35, 337, 332, 331, 33, 3, 21
*                    I
*skip
* */