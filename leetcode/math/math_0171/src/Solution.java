//https://leetcode.com/problems/excel-sheet-column-number/submissions/
//2021-10-23

public class Solution {
    public int titleToNumber(String columnTitle) {
        int answer = 0;

        for(int i = 0; i < columnTitle.length(); i++){
            answer *= 26;
            switch(columnTitle.charAt(i)){
                case 'A':
                    answer += 1;
                    break;
                case 'B':
                    answer += 2;
                    break;
                case 'C':
                    answer += 3;
                    break;
                case 'D':
                    answer += 4;
                    break;
                case 'E':
                    answer += 5;
                    break;
                case 'F':
                    answer += 6;
                    break;
                case 'G':
                    answer += 7;
                    break;
                case 'H':
                    answer += 8;
                    break;
                case 'I':
                    answer += 9;
                    break;
                case 'J':
                    answer += 10;
                    break;
                case 'K':
                    answer += 11;
                    break;
                case 'L':
                    answer += 12;
                    break;
                case 'M':
                    answer += 13;
                    break;
                case 'N':
                    answer += 14;
                    break;
                case 'O':
                    answer += 15;
                    break;
                case 'P':
                    answer += 16;
                    break;
                case 'Q':
                    answer += 17;
                    break;
                case 'R':
                    answer += 18;
                    break;
                case 'S':
                    answer += 19;
                    break;
                case 'T':
                    answer += 20;
                    break;
                case 'U':
                    answer += 21;
                    break;
                case 'V':
                    answer += 22;
                    break;
                case 'W':
                    answer += 23;
                    break;
                case 'X':
                    answer += 24;
                    break;
                case 'Y':
                    answer += 25;
                    break;
                case 'Z':
                    answer += 26;
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
}