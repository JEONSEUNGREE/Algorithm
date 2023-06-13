// 홀짝구분
// https://school.programmers.co.kr/learn/courses/30/lessons/12937

class Solution {
    public String solution(int num) {
        String answer = "";

        String[] stdArray = {"Odd", "Even"};

        answer = num % 2 == 0 ? stdArray[1] : stdArray[0];

        return answer;
    }
}

