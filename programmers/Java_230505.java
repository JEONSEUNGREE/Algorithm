// 크기가작은 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String t, String p) {
        
    int answer = 0;

    int sLenght = p.length();
        
    long stdValue = Long.parseLong(p);

    List<Long> stdList = new ArrayList<Long>();

    for(int i = 0; i <= t.length() - sLenght; i++){
        stdList.add(Long.parseLong(t.substring(i, sLenght + i)));
    }
        
    answer = Long.valueOf(stdList.stream().filter(item -> item <= stdValue).count()).intValue();

    return answer;
}
}
