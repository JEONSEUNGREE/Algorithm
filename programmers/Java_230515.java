// 신고결과받기
//https://school.programmers.co.kr/learn/courses/30/lessons/92334


// 주의해야할점
// contains사용시 frodo에 frodo frod fro등이같이 선택됨
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        LinkedHashMap <String, HashSet<String>> idMap = new LinkedHashMap<String, HashSet<String>>();

        LinkedHashMap <String, Integer> reportMap = new LinkedHashMap<String,Integer>();

        List<String> reportDistinct = Arrays.asList(report).stream().distinct().collect(Collectors.toList());

        // 초기화
        for(int i = 0; i < id_list.length; i++){
            idMap.put(id_list[i], new HashSet<String>());
            reportMap.put(id_list[i], 0);
        }

        
        // 신고한 횟수 체크
        for(int i = 0; i < reportDistinct.size(); i++){
            String reporter = reportDistinct.get(i).split(" ")[0];
            String reportTarget = reportDistinct.get(i).split(" ")[1];

            idMap.get(reporter).add(reportTarget);
            if(idMap.containsKey(reportTarget)){
                reportMap.put(reportTarget, reportMap.get(reportTarget) + 1);
            }
            
        }

        // 차단한 횟수 체크
        List<String> stopAccountList = reportMap.entrySet()
            .stream().filter(item -> item.getValue() >= k)
            .map(item -> item.getKey()).collect(Collectors.toList());

        int index = 0;
        for (HashSet<String> value : idMap.values()){
            answer[index] = (int) stopAccountList.stream().filter(item -> value.contains(item)).count();
            index++;
        }
        
        return answer;
    }
}
