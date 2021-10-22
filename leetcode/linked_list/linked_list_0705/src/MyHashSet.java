//https://leetcode.com/problems/design-hashset/submissions/
//Design HashSet

public class MyHashSet {
    private class HashList{
        int val;
        HashList next;

        public HashList(){}

        public HashList(int val) {
            this.val = val;
        }
        public HashList(int val, HashList next){
            this.val = val;
            this.next = next;
        }
    }
    HashList head = new HashList();
    public MyHashSet(){}
    public void add(int key){
        if(contains(key)) return;
        HashList backup = head;
        HashList adding = new HashList(key);
        while(head.next != null) head = head.next;
        head.next = adding;
        head = backup;
    }
    public void remove(int key){
        HashList backup = new HashList(0, head);
        while(head.next != null){
            if(head.next.val == key){
                if(head.next.next == null) head.next = null;
                else head.next = head.next.next;
                head = backup.next;
                return;
            }
            head = head.next;
        }
        head = backup.next;
    }
    public boolean contains(int key){
        HashList backup = new HashList(0, head);
        while(head.next != null){
            if(head.next.val == key){
                head = backup.next;
                return true;
            }
            head = head.next;
        }
        head = backup.next;
        return false;
    }
}

/*
* //https://leetcode.com/problems/design-hashset/discuss/1494743/Java-or-Array-or-100
public class MyHashSet{
boolean arr[];
public MyHashSet() {
	arr=new boolean[1000001];
}

public void add(int key) {
	arr[key]=true;
}

public void remove(int key) {
	arr[key]=false;
}

public boolean contains(int key) {
	return arr[key];
}

}
*
*
* */

