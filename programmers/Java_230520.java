// 숫자짝꿍
// https://school.programmers.co.kr/learn/courses/30/lessons/131128
// stringbuilder로 사용시 속도가 훨씬빠름
// 이유 : string은 더하면 새로운객체를 생성하기때문에 stringbuilder로 단일객체에 더하면 객체생성시간을줄여 부하가 줄어


import java.util.stream.IntStream;

class Solution {
    public String solution(String x, String y) {
        StringBuilder answer = new StringBuilder();
        int[] xArray = new int[10];
        int[] yArray = new int[10];

        for(int i = 0; i <= 9; i++){
            xArray[i] = x.length() - x.replaceAll(String.valueOf(i), "").length();
            yArray[i] = y.length() - y.replaceAll(String.valueOf(i), "").length();
        }

        for(int i = xArray.length - 1; 0 <= i; i--){
            int tmpLength = xArray[i] > 0 && yArray[i] > 0 ? xArray[i] <= yArray[i] ? xArray[i] : yArray[i] : 0;
            for(int j = 0; j < tmpLength; j++){
                answer.append(String.valueOf(i));
            }
        }

        return answer.length() != 0 ? (xArray[0] <= yArray[0] ? xArray[0] : yArray[0]) == answer.length() ? "0" : answer.toString() : "-1";
    }
}
