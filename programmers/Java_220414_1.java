// 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
// complete
class Solution {
    public int solution(int n, int m, int[] section) {
	// 횟수 
        int answer = 1;
	// 이전 롤러페인트 넓이
        int prevPaint = section[0] + m - 1;

        for(int i = 0; i < section.length; i++){
	    // 이전 롤러페인트가 현재 넓이를 넘으면 횟수 추가
            if(prevPaint < section[i]){
                prevPaint = section[i] + m - 1;
                answer++;
            }
        }

        return answer;
    }
}

