// 문자열PY갯수세기
// https://school.programmers.co.kr/learn/courses/30/lessons/12916

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        answer = Arrays.asList(s.split("")).stream().filter(ch -> "P".equalsIgnoreCase(ch) || "Y".equalsIgnoreCase(ch)).map(ch -> "P".equalsIgnoreCase(ch) ? 1 : -1).reduce(0, (a,b) -> a + b) == 0 ? true : false; 
        return answer;
    }
}
