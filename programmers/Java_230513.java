// 삼총사
//https://school.programmers.co.kr/learn/courses/30/lessons/131705
class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length; i++){
           for(int j = i + 1; j < number.length; j++){
              for(int k = j + 1; k < number.length; k++){
                 if(0 == number[k] + number[j] + number[i]){
                    answer++;
                 }
            }
          }
        }
        return answer;
    }
}

