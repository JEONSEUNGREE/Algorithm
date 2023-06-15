// 평균구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944

// stream에 average함수존재

import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        answer = Arrays.stream(arr).sum() / (double) arr.length;

        return answer;
    }
}


