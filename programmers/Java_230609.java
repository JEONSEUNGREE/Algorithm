// 자연수뒤집어배열로만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932

import java.util.stream.IntStream;

public class Solution {
    public int[] solution(long n) {
        String[] targetArr = String.valueOf(n).split("");
        int[] answer = {};
        answer = IntStream.rangeClosed(1, targetArr.length).map(num -> Integer.valueOf(targetArr[targetArr.length - num])).toArray();
        return answer;
    }
}


