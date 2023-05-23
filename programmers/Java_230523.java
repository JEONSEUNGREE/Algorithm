// 포켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num) {
        int answer = 0;

        int count = (int) IntStream.of(num).distinct().count();

        return (num.length / 2) > count ? count : (num.length / 2);
    }
}


