// 자릿수더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12931

import java.util.stream.Stream;

public class Solution {
public int solution(int n) {
        int answer = 0;
        answer = Stream.of(String.valueOf(n).split("")).mapToInt(num -> Integer.valueOf(num)).sum();
        return answer;
    }    
}
