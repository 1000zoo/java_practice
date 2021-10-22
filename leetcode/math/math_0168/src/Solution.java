public class Solution {
    public String convertToTitle(int columnNumber){
        StringBuilder answer = new StringBuilder();
        char put;

        while(columnNumber > 0){
            if(columnNumber % 26 == 0) put = 'Z';
            else put = (char) ((columnNumber % 26) + '@');
            answer.append(put);
            if(columnNumber == 26) break;
            if(columnNumber % 26 == 0) {
                columnNumber /= 26;
                columnNumber -= 1;
            }else{
                columnNumber /= 26;
            }
        }
        return answer.reverse().toString();
    }
}
