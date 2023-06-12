// 작은수만제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;


class Solution {
    public int[] solution(int[] a) {
        int[] answer = {};

        if(a.length == 1){
            answer = new int[]{-1};
            return answer;
        }

        int minIndex = IntStream.range(0, a.length).boxed().min(Comparator.comparingInt(i -> a[i])).get().intValue();

        List<Integer> intArray = Arrays.stream(a).boxed().collect(Collectors.toList());

        intArray.remove(minIndex);

        answer = intArray.stream().mapToInt(num -> num).toArray();

        return answer;
    }
}


