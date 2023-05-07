// 문자열나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108

class Solution {
    public int solution(String str) {

        int answer = 0;

        char stdCh = ' ';

        int std = 0;

        int diff = 0;

        for(int i = 0; i < str.length(); i++){

            if(stdCh == ' '){
                stdCh = str.charAt(i);
            }

            if(stdCh == str.charAt(i)){
                std++;
            }else{
                diff++;
            }

            if(std == diff){
                answer++;
                std = 0;
                diff = 0;
                stdCh = ' ';
            }
        }

        if(stdCh != ' '){
            answer++;
        }
        
        return answer;
    }
}

