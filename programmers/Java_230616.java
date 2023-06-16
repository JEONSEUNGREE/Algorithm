// 하샤드수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947

import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        answer = x % Arrays.stream(String.valueOf(x).split("")).mapToInt(num -> Integer.valueOf(num)).sum() == 0 ? true : false;

        return answer;
    }
}


