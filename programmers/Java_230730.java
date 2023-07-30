// 다트게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17682


class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        int index = 0;
        int defaultVal = 2;
        String exceptionScore = "10";
        int[] scoreArray = new int[3];
        int[] bonusArray = new int[3];

        for(int i = 0; i < 3; i++){
            String tmpScore = dartResult.substring(index, index + defaultVal);
            int defaultScore = Integer.valueOf(String.valueOf(tmpScore.charAt(0)));
            if(exceptionScore.equals(tmpScore)){
                defaultScore = Integer.valueOf(String.valueOf(tmpScore));
                tmpScore = dartResult.substring(index + 1, index + defaultVal + 1);
                index++;
            }
            int multipleScore = 1;
            char bonus = index + 2 < dartResult.length() ? dartResult.charAt(index + defaultVal) : 0;
            bonusArray[i] = 1;

            switch(tmpScore.charAt(1)){
                case 'S':
                    multipleScore = 1;
                    break;
                case 'D':
                    multipleScore = 2;
                    break;
                case 'T':
                    multipleScore = 3;
                    break;
            }

             switch(bonus){
                case '#':
                    scoreArray[i] = (int) Math.pow(defaultScore, multipleScore) * -1;
                    index++;
                    break;
                case '*':
                    scoreArray[i] = (int) Math.pow(defaultScore, multipleScore) * 2;
                    bonusArray[i] = 2;
                    index++;
                    break;
                default:
                    scoreArray[i] = (int) Math.pow(defaultScore, multipleScore);
                    break;
            }
            index += 2;
        }

        index = 1;
        while(index < 3){
            if(bonusArray[index] == 2){
                scoreArray[index - 1] = scoreArray[index - 1] * 2;
            }
            index++;
        }

        answer = scoreArray[0] + scoreArray[1] + scoreArray[2];

        return answer;
    }
}

