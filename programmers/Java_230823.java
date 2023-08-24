// 실패율 
// https://school.programmers.co.kr/learn/courses/30/lessons/42889

import java.util.LinkedList;

import java.util.List;

import java.util.Map;

import java.util.HashMap;

import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int leastCount = stages.length;

        HashMap<Integer, Integer> stageMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Double> percentMap = new HashMap<Integer, Double>();

        for(int i = 0; i < stages.length; i++){
            stageMap.put(stages[i], stageMap.getOrDefault(stages[i], 0) + 1);
        }

        for(int i = 1; i <= N; i++){
            int curCount = stageMap.getOrDefault(i, 0);
            double curPercent = leastCount == 0 ? 0 : (double)curCount / (double)leastCount;
            leastCount = leastCount - curCount;
            percentMap.put(i, curPercent);
        }

        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(percentMap.entrySet());

        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        answer = entryList.stream().mapToInt(item -> item.getKey()).toArray();

        return answer;
    }
}
