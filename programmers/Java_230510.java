// 옹알이
//https://school.programmers.co.kr/learn/courses/30/lessons/133499

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] stdArray = { 
             "ayaaya", "yeye", "woowoo", "mama",
            "aya", "ye", "woo", "ma"
        };

        for(int i = 0; i < babbling.length; i++){
            String tmp = babbling[i];
           for(int j = 0; j < stdArray.length; j++){
             if(j < 4 && tmp.indexOf(stdArray[j]) != -1){
               break;
             }else{
                 tmp = tmp.replaceAll(stdArray[j], "X");
             }
        }
           if(tmp.replaceAll("X", "").length() == 0){
               answer++;
           }
        }
        
        
        return answer;
    }
}

