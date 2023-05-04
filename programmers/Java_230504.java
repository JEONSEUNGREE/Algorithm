// 대충만든자판
// https://school.programmers.co.kr/learn/courses/30/lessons/160586

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        List<HashMap> keyList = new ArrayList<HashMap>();
        HashMap<String,Integer> tmpKeyMap;
        // 각 알파벳을 쪼개서 map형태로 저장
        for(int i = 0; i < keymap.length; i++){
            tmpKeyMap = new HashMap<String,Integer>();
            for(int j = 0; j < keymap[i].length(); j++){
                String tmpKey = String.valueOf(keymap[i].charAt(j));
                if(tmpKeyMap.get(tmpKey) == null){
                    tmpKeyMap.put(tmpKey, j + 1);
                }
            }
            keyList.add(tmpKeyMap);
        }

        for(int i = 0; i < targets.length; i++){
            int tmp = i;
            for(int j = 0; j < targets[i].length(); j++){
                int tmp2 = j;
                String tmpKey = String.valueOf(targets[tmp].charAt(tmp2));
                // 제일 낮은 밸류값 리턴
                int tmpValue = keyList.stream()
                    .filter(item -> item.get(tmpKey) != null)
                    .mapToInt(item -> (int)item.get(tmpKey))
                    .min().orElse(-1);

                if(tmpValue == -1){
                    answer[i] = -1;
                    break;
                }else{
                    answer[i] += tmpValue;
                }
            }
        }
        return answer;
    }
}
