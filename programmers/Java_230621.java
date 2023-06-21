// 예산
// https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.Arrays;

class Solution {
    static int tmpVal = 0;
    public int solution(int[] d, int budget) {
        int answer = 0;
        tmpVal = budget;
        answer = Arrays.stream(d).sorted().map(num -> {tmpVal = tmpVal - num; return tmpVal >= 0 ? 1 : 0;}).sum();
        return answer;
    }
}


