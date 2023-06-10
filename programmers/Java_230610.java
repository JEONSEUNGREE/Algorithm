// 정수거꾸로변경
// https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;

        answer = Long.valueOf(Stream.of(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining("")));

        return answer;
    }
}

