// 서울에서김서방찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919


import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int kimIndex = IntStream.range(0, seoul.length)
            .filter(isKim -> "Kim".equals(seoul[isKim])).findFirst().getAsInt();
        answer = "김서방은 "+kimIndex+ "에 있다";
        return answer;
    }
}

