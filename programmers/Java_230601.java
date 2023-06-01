// 문자열내마음대로정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.stream.Stream;
import java.util.Comparator;


class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        answer = Stream.of(strings)
            .sorted(Comparator.comparing(text -> text.toString().charAt(n))
            .thenComparing(text -> text.toString())).toArray(String[]::new);
        return answer;
    }
}

