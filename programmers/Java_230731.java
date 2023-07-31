// 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862

import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        String isNotUsed = "Y";
        String isUsed = "N";

        HashMap<Integer, String> lostList = new HashMap<>();

        HashMap<Integer, String> reserveList = new HashMap<>();

        ArrayList<Integer> addList = new ArrayList<>();

        for(int i = 0; i < lost.length; i++){
            lostList.put(lost[i], isUsed);
        }

        for(int i = 0; i < reserve.length; i++){
            if(lostList.get(reserve[i]) == null){
                reserveList.put(reserve[i], isNotUsed);
            }else{
                lostList.remove(reserve[i]);
            }
        }

        lostList.forEach((key, value) -> {
            if(isNotUsed.equals(reserveList.getOrDefault(key - 1, isUsed))){
                reserveList.put(key - 1, isUsed);
                addList.add(key);
            }
            else if(isNotUsed.equals(reserveList.getOrDefault(key + 1, isUsed))){
                reserveList.put(key + 1, isUsed);
                addList.add(key);
            }
        });

        answer = n - lostList.size() + addList.size();

        return answer;
    }
}
