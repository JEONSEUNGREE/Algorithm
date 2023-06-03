// 숫자문자로변환
// https://school.programmers.co.kr/learn/courses/30/lessons/12918

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(!(4 == s.length() || 6 == s.length())){
            return false;
        }
        try{
            Long.valueOf(s);
        }catch(Exception e){
            answer = false;
        }
        return answer;
    }
}

