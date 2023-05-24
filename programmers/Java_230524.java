// 가운데글자가져오기
// https://school.programmers.co.kr/learn/courses/30

class Solution {
    public String solution(String s) {
        String answer = "";
        answer = s.length() % 2 == 0 ? (String.valueOf(s.charAt(Math.round(s.length() / 2) - 1)) + String.valueOf(s.charAt((int) Math.round(s.length() / 2))))
                : String.valueOf(s.charAt((int) Math.floor(s.length() / 2)));
        return answer;
    }
}
