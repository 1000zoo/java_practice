public class Start {
    public static void main(String[] args) {

        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(3)); // return False, (not found)
        myHashSet.add(2);
        System.out.println(myHashSet.contains(2)); // return True
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2)); // return False, (already
        // removed)






        myHashSet.remove(19);
        myHashSet.add(9);
        myHashSet.remove(19);
        myHashSet.add(14);
        myHashSet.remove(19);
        myHashSet.remove(9);
        myHashSet.add(0);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(0);
        myHashSet.remove(9);


        /*
        ["MyHashSet","add","remove","add","remove","remove","add","add","add","add","remove"]
        [[],          [9], [19],   [14],  [19],    [9],     [0],  [3],  [4],[0],[9]]
        ["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
        [[],          [1],  [2],    [1],        [3],     [2],  [2],       [2],    [2]]
        */
    }
}
