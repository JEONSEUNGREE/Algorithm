// 콜라문제
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a){
           int tmp = n / a;
           if(tmp != 0){
              answer += tmp * b;
              n = tmp * b + n % a;
           }
        }

        return answer;
    }
}


