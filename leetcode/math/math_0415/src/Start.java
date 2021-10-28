public class Start {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.addStrings("2", "999998"));
    }
}

/*test
        *
        StringBuilder a = new StringBuilder("123");
        StringBuilder b = new StringBuilder("111");

        int k = (a.charAt(2) - '0' + 1);
        int l = b.charAt(2) - '0' + 1;

        System.out.println(a.charAt(2) - '0' + b.charAt(2) - '0');
        System.out.println(k);
        System.out.println(l);
        System.out.println(k + l);
        System.out.println(a.charAt(2));
        System.out.println(b.charAt(2));
        * */
