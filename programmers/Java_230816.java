// 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491


class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int bigStd = 0;
        int smallStd = 0;
        int tmpBig = 0;
        int tmpSmall = 0;

        for(int[] item : sizes){
            tmpBig = item[0] < item[1] ? item[1] : item[0];
            tmpSmall = item[0] < item[1] ? item[0] : item[1];

            if(bigStd < tmpBig){
                bigStd = tmpBig;
            }

            if(smallStd < tmpSmall){
                smallStd = tmpSmall;
            }
        }

        answer = bigStd * smallStd;
        
        return answer;
    }
}
