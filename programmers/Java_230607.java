// 이상한문자만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
    public String solution(String s) {
        String answer = "";
        int tmpIndex = 0;
        StringBuilder strBrd = new StringBuilder();
        String[] sArray = s.split("");

        for(int i = 0; i < sArray.length; i++){
            String tmpS = sArray[i];

            if(" ".equals(tmpS)){
                strBrd.append(" ");
                tmpIndex = 0;
                continue;
            }

            if(tmpIndex % 2 == 0){
                strBrd.append(tmpS.toUpperCase());
             }else{
                strBrd.append(tmpS.toLowerCase());
             }

            tmpIndex++;
        }

        answer = strBrd.toString();
        
        return answer;
    }
}
