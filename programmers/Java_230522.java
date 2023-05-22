// 키패드누르기
// https://school.programmers.co.kr/learn/courses/30/lessons/67256

import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        HashMap<Integer, String> keyMap = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        // * 좌표
        int[] curLeft = {3, 0};
        // # 좌표
        int[] curRight = {3, 2};
        boolean primaryHand = "left".equals(hand) ? true : false;

        // 3x3 키패드 세팅
        int num = 1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(1 == num || 4 == num || 7 == num){
                    left.put(num, 1);
                }else if(3 == num || 6 == num || 9 == num){
                    right.put(num, 1);
                }
                keyMap.put(num++, String.valueOf(i) + String.valueOf(j));
            }
        }
        // 0번 세팅
        keyMap.put(0, "31");

        for(int i = 0; i < numbers.length; i++){
            // 입력 받은 번호
            String targetPos = keyMap.get(numbers[i]);
            int x = Integer.valueOf(targetPos.split("")[1]);
            int y = Integer.valueOf(targetPos.split("")[0]);

            // 거리계산
            int tmpLeft = Math.abs(curLeft[1] - x) + Math.abs(curLeft[0] - y);
            int tmpRight = Math.abs(curRight[1] - x) + Math.abs(curRight[0] - y);

            // left 키패드해당
            if(left.getOrDefault(numbers[i], 0) != 0){
                curLeft[1] = x;
                curLeft[0] = y;
                answer.append("L");
            }else if(right.getOrDefault(numbers[i], 0) != 0){
                curRight[1] = x;
                curRight[0] = y;
                answer.append("R");
            }else {
                // 중간 번호인 경우 비교
                if(tmpLeft > tmpRight){
                    curRight[1] = x;
                    curRight[0] = y;
                    answer.append("R");
                } else if(tmpLeft < tmpRight){
                    curLeft[1] = x;
                    curLeft[0] = y;
                    answer.append("L");
                }else if(primaryHand){
                    curLeft[1] = x;
                    curLeft[0] = y;
                    answer.append("L");
                }else {
                    curRight[1] = x;
                    curRight[0] = y;
                    answer.append("R");
                }
            }
        }

        return answer.toString();
    }
}

