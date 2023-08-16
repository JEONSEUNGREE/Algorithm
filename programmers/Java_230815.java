// 부족한금액계산
// https://school.programmers.co.kr/learn/courses/30/lessons/82612

import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        answer = money - LongStream.rangeClosed(1, count).map(num -> price * num).sum();

        return 0 < answer ? 0 : Math.abs(answer);
    }
}


