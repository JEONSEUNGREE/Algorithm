// 휴대폰뒷자리마스킹처리
// https://school.programmers.co.kr/learn/courses/30/lessons/12948

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public String solution(String phone_number) {
        String answer = "";

        AtomicInteger index = new AtomicInteger();

        answer = Stream.of(phone_number.split("")).map(str -> index.getAndIncrement() < phone_number.length() - 4 ? "*" : str).collect(Collectors.joining(""));

        return answer;
    }
}
