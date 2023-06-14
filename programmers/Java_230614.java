// 콜라츠추측
//https://school.programmers.co.kr/learn/courses/30/lessons/12943

class Solution {
    public int solution(int num) {
        int answer = 0;

        long tmp = num;

        int cnt = 0;

        while(tmp != 1 && cnt < 500){
            tmp = tmp % 2 == 0 ? tmp / 2 : tmp * 3 + 1;
            cnt++;
        }

        answer = cnt < 500 ? cnt : -1;

        return answer;
    }
}
