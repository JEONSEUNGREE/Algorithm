// 나누어떨어지는숫자배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;

        answer = IntStream.range(0, arr.length).filter(num -> arr[num] % divisor == 0).map(num -> arr[num]).sorted().toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}

