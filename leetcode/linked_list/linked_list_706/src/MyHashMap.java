//https://leetcode.com/problems/design-hashmap/submissions/
//2021-10-20

public class MyHashMap {// using array
    public MyHashMap() {}

    boolean[] k = new boolean[1000001];
    int[] v = new int[1000001];

    public void put(int key, int value) {
        if(!k[key]) k[key] = true;
        v[key] = value;
    }

    public int get(int key) {
        if(k[key]) return v[key];
        else return -1;
    }

    public void remove(int key) {
        k[key] = false;
    }
}