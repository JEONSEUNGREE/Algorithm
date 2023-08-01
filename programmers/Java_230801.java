// 완주하지못한선
// https://school.programmers.co.kr/learn/courses/30/lessons/42576


import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> completionMap = new HashMap<>();

        for(int i = 0; i < completion.length; i++){
            completionMap.put(completion[i], completionMap.getOrDefault(completion[i], 0) + 1);
        }

        for(int i = 0; i < participant.length; i++){
            if(completionMap.getOrDefault(participant[i], 0) < 1){
                answer = participant[i];
                break;
            }else{
                completionMap.put(participant[i], completionMap.get(participant[i]) - 1);
            }
        }

        return answer;
    }
}
