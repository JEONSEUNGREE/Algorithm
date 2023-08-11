// 두개뽑아서더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/68644

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> setNumber = new HashSet<Integer>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                setNumber.add(numbers[i] + numbers[j]);
            }
        }

        answer = setNumber.stream().sorted().mapToInt(num -> num).toArray();

        return answer;
    }
}
