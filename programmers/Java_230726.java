// 소수찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12921

// 효율성, 효율성실패

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] stdArray = new int[n + 1];

        stdArray[0] = stdArray[1] = -1;
        
        for(int i = 2; i * i <= n; i++){
            if(stdArray[i] == -1){
                continue;
            }
            for(int j = i + i; j <= n; j+=i){
                stdArray[j] = -1;
            }
        }

        answer = (int)Arrays.stream(stdArray).filter(num -> num != -1).count();

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                answer++;
            }
        }

        return answer;
    }
}
