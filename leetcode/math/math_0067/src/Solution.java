//https://leetcode.com/problems/add-binary/
//2021-10-22

class Solution {
    public String addBinary(String a, String b) {
        boolean carry = false;
        String answer = "";
        String put = "";
        StringBuilder bufA = new StringBuilder(a);
        StringBuilder bufB = new StringBuilder(b);
        a = bufA.reverse().toString();
        b = bufB.reverse().toString();
        if(a.length() < b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        int length = b.length();

        for(int i = 0; i < length; i++){
            if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                put = carry ? "1" : "0";
                carry = false;
            } else if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                put = carry ? "1" : "0";
                carry = true;
            } else {
                put = carry ? "0" : "1";
            }
            answer = put.concat(answer);
        }
        for(int i = length; i < a.length(); i++){
            if(carry && a.charAt(i) == '1'){
                put = "0";
                carry = true;
            } else if(!carry && a.charAt(i) == '0'){
                put = "0";
                carry = false;
            } else {
                put = "1";
                carry = false;
            }
            answer = put.concat(answer);
        }
        if(carry){
            put = "1";
            answer = put.concat(answer);
        }
        return answer;
    }
}