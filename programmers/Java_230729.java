// k번째 수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748


import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int startPos = commands[i][0] - 1;
            int endPos = commands[i][1] - 1;
            int kNum = commands[i][2] - 1;
            int[] tmpArray = new int[endPos - startPos + 1];

            for(int j = 0; j < tmpArray.length; j++){
                tmpArray[j] = array[startPos++];
            }

            tmpArray = Arrays.stream(tmpArray).sorted().toArray();
            answer[i] = tmpArray[kNum];
        }

        return answer;
    }
}
