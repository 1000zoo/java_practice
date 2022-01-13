public class RandomIntegerArrayGenerator {
    public static void main(String[] args){
        for(int i = 0; i < 99998; i++){
            System.out.print((int)(Math.random()*10000) + ",");
        }
    }
}
