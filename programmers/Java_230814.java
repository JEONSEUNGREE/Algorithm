// 3진법뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935


class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder tmpVal = new StringBuilder();

        tmpVal.append(Integer.toString(n, 3));

        tmpVal.reverse();

        answer = Integer.parseInt(tmpVal.toString(), 3);

        return answer;
    }
}

