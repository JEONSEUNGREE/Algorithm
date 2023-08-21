// 성격유형검사하기
// https://school.programmers.co.kr/learn/courses/30/lessons/118666


import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String stdMbti = "RTCFJMAN";
        HashMap<String, Integer> mbtiScore = new HashMap<>();

        for(int i = 0; i < choices.length; i++){
            String stdVal = choices[i] < 4 ? survey[i].substring(0,1) : survey[i].substring(1,2);
            int prevVal = mbtiScore.getOrDefault(stdVal, 0);
            mbtiScore.put(stdVal, choices[i] < 4 ? prevVal + 4 - choices[i] : prevVal + choices[i] - 4);
        }

        for(int i = 2; i <= stdMbti.length(); i+=2){
            String std1 = stdMbti.substring(i - 2, i - 1);
            String std2 = stdMbti.substring(i - 1, i);
            answer += mbtiScore.getOrDefault(std2, 0) <= mbtiScore.getOrDefault(std1, 0) ? std1 : std2;
        }

        return answer;
    }
}
