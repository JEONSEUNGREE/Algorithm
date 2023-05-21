// 로또의최고순위와최저순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484

import java.util.HashMap;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        IntStream.range(0, 6).forEach(num -> {
            numMap.put(lottos[num], numMap.getOrDefault(lottos[num], 0) + 1);
            numMap.put(win_nums[num], numMap.getOrDefault(win_nums[num], 0) + 1);
        });

        answer[0] = 7 - (12 - numMap.size() - (numMap.getOrDefault(0, 0) != 0 ? -1 : 0));
        answer[1] = 7 - (12 - numMap.size()) + (numMap.getOrDefault(0, 0) != 0 ? numMap.get(0) - 1 : 0);

        answer[0] = answer[0] >= 7 ? 6 : answer[0];
        answer[1] = answer[1] >= 7 ? 6 : answer[1];

        return answer;
    }
}


