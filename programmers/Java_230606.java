// 약수의합 
// https://school.programmers.co.kr/learn/courses/30/lessons/12928


import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = IntStream.rangeClosed(1, n).filter(num -> n % num == 0).sum();
        return answer;
    }
}

