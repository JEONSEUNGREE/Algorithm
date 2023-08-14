// 약수의개수와덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        boolean isMinus = false;

        for(int i = left; i <= right; i++){
            isMinus = false;
            for(int j = 1; j * j <= i; j++){
                if(j * j == i) isMinus = !isMinus;
            }
            answer += isMinus ? -i : i;
        }
        return answer;
    }
}

