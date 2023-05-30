// 문자열역순정렬
// https://school.programmers.co.kr/learn/courses/30/lessons/12917


import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        String answer = "";

        answer = Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());

        return answer;
    }
}


