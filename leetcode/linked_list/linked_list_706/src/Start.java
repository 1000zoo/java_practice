//https://leetcode.com/problems/design-hashmap/submissions/
//2021-10-20

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.remove(1);
        solution.put(1, 1);
        solution.put(2, 2);
        System.out.println(solution.get(1));
        solution.put(1, 4);
        System.out.println(solution.get(1));
        solution.put(0, 4);
        solution.get(0);
        System.out.println(solution.get(0));
    }
}
