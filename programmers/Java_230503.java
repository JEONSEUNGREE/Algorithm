// 둘만의암호
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++){
            char tmpStd = s.charAt(i);
            for(int j = 0; j < index; j++){
                tmpStd++;
                if(122 < tmpStd){
                    tmpStd = (char) (tmpStd - 122 + 96);
                }
                if(skip.contains(String.valueOf(tmpStd))){
                    j--;
                }
            }
            answer += tmpStd;
        }
        return answer;
    }
}
