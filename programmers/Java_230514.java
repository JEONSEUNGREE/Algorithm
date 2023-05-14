// 없는수더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        answer = 45 - Arrays.stream(numbers).sum();

        return answer;
    }
}

