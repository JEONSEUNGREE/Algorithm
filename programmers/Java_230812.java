// 음양더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501

import java.util.stream.IntStream;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length).map(num -> signs[num] ? absolutes[num] : -absolutes[num]).sum();
    }
}
