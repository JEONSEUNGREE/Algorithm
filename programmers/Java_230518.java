// 숫자문자열과영단어
// https://school.programmers.co.kr/learn/courses/30/lessons/81301

class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = s;
        String[] converter = 
            new String[] { 
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
            };

        for(int i = 0; i < converter.length; i++){
            tmp = tmp.replaceAll(converter[i], String.valueOf(i));
        }
         answer = Integer.parseInt(tmp);

        return answer;
    }
}
