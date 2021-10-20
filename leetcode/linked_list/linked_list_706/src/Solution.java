//https://leetcode.com/problems/design-hashmap/submissions/
//2021-10-20

public class Solution {
    private class MapList{
        int[] val = new int[2];
        MapList next;

        public MapList(){}
        public MapList(int[] val){ this.val = val; }
        public MapList(int[] val, MapList next){
            this.val = val;
            this.next = next;
        }
    }
    MapList head = new MapList();
    public Solution() {}

    public void put(int key, int value) {
        MapList backup = head;
        while(head.next != null){
            if(head.next.val[0] == key){
                head.next.val[1] = value;
                head = backup;
                return;
            }
            head = head.next;
        }
        MapList adding = new MapList(new int[] {key, value});
        head.next = adding;
        head = backup;
    }

    public int get(int key) {
        MapList backup = head;
        int ret = -1;
        while(head.next != null){
            if(head.next.val[0] == key){
                ret = head.next.val[1];
                head = backup;
                return ret;
            }
            head = head.next;
        }
        head = backup;
        return ret;
    }

    public void remove(int key) {
        MapList backup = head;
        while(head.next != null){
            if(head.next.val[0] == key){
                if(head.next.next == null) head.next = null;
                else head.next = head.next.next;
                head = backup;
                return;
            }
            head = head.next;
        }
        head = backup;
    }
}

