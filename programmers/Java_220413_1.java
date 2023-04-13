// 추억 점수: https://school.programmers.co.kr/learn/courses/30/lessons/176963 complete
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Java_220413_1 {
    public static void main(String[] args) {
        Java_220413_1 java2204131 = new Java_220413_1();
        int[] solution = java2204131.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});
        Arrays.stream(solution).forEach(System.out::println);
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 2차 배열 외각 길이
        int outLength = photo.length;
        // 이름 길이
        int nameLength = name.length;
        // 답변 길이 초기화
        int[] answer = new int[outLength];
        // 이름과 점수를 MAP형태로 저장
        Map<String, Integer> scoreList = new HashMap<String, Integer>();
        for (int i = 0; i < nameLength; i++) {
            scoreList.put(name[i], yearning[i]);
        }
        // 2차배열의 외각 부터 순회
        for (int i = 0; i < outLength; i++) {
            int inLength = photo[i].length;
            int curTotalValue = 0;
            // 1차배열에서 값 합산
            for (int j = 0; j < inLength; j++) {
                String popPhoto = photo[i][j];
                curTotalValue += scoreList.getOrDefault(popPhoto, 0);
            }
            answer[i] = curTotalValue;
        }
        return answer;
    }
}

