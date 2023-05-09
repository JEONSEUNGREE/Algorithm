// 과일장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
    int answer = 0;

    List<Integer> scoreList = Arrays.stream(score)
                        .boxed()
                        .sorted((a, b) -> b - a)
                        .collect(Collectors.toList());

    for(int i = 0; i + m <= scoreList.size(); i += m){
        // 최저 점수
        answer += scoreList.get(i + m - 1) * m;
    }

    return answer;
    }
}
