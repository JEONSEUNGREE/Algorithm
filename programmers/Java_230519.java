// 수박수받
//https://school.programmers.co.kr/learn/courses/30/lessons/12922

class Solution {
    public String solution(int n) {
        String answer = " ";

        for(int i = 0; i < n; i++){
            answer += "수".equals(answer.substring(answer.length()-1)) ? "박" : "수";
        }
        answer = answer.substring(1);

        return answer;
    }
}


