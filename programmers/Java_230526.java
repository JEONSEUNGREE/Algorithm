// 같은숫자는싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int idx = 0;

        for(int i = 0; i < arr.length; i++){
           if(i + 1 != arr.length && arr[i] != arr[i + 1]){
              answer[idx++] = arr[i];
           }
        }

        answer[idx++] = arr[arr.length - 1];
        
        return Arrays.copyOfRange(answer, 0, idx);
    }
}
