// 푸드파이터
// https://school.programmers.co.kr/learn/courses/30/lessons/134240

class Solution {
    public String solution(int[] food) {
        String answer = "";
        int tmpVal = 0;
        StringBuilder tmpFood = new StringBuilder();

        for(int i = 1; i < food.length; i++){
            tmpVal = food[i] / 2;
            while(0 < tmpVal--){
                tmpFood.append(i);
            }
        }

        answer = tmpFood.toString() + 0 + tmpFood.reverse();

        return answer;
    }
}


