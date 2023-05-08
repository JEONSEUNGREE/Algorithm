// 명예의전당
//https://school.programmers.co.kr/learn/courses/30/lessons/138477

class Solution {
    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        int[] topScoreList = new int[k];

        for(int i = 0; i < score.length; i++){
            int curScore = score[i];
            for(int j = 0; j < topScoreList.length; j++){
                if(topScoreList[j] < curScore){
                    int prevScore = topScoreList[j];
                    topScoreList[j] = curScore;
                    curScore = prevScore;
                }
            }
            
            if(i >= k){
                answer[i]=topScoreList[k - 1];
            }
            else{
                answer[i] = topScoreList[i];
            }
        }


        return answer;

    }
}

