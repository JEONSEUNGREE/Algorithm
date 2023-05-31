// 두정수사이의합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912

import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long small = a > b ? b : a;

        answer = LongStream.rangeClosed(0, Math.abs(b - a)).map(num -> num + small).sum();

        return answer;
    }
}

