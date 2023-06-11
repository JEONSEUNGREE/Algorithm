// 양의정수제곱근구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12934

class Solution {
    public long solution(long n) {
        long answer = -1;

        double val = Math.sqrt(n);

        if(val == (int)val){
            answer = (long)Math.pow(val + 1,2);
        }

        return answer;
    }
}
