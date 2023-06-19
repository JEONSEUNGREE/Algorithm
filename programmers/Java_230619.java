// x만큼n개의간격이있는수
// https://school.programmers.co.kr/learn/courses/30/lessons/12954

import java.util.stream.LongStream;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};

        answer = LongStream.rangeClosed(1, n).map(num -> x * num).toArray();

        return answer;
    }
}
