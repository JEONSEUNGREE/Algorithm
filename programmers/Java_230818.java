// 기사단원무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798


class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int tmp = 0;

        for(int i = 0; i <= number; i++){
            tmp = 0;
            for(int j = 1; j * j <= i; j++){
                if(j * j == i) tmp++;
                else if(i % j == 0) tmp += 2;
            }
            answer += tmp <= limit ? tmp : power;
        }
        return answer;
    }
}


