// 모의고가
// https://school.programmers.co.kr/learn/courses/30/lessons/42840


import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        DefaultSupoja firstSupoja = new DefaultSupoja(new int[]{1,2,3,4,5}, 1);
        DefaultSupoja secondSupoja = new DefaultSupoja(new int[]{2,1,2,3,2,4,2,5}, 2);
        DefaultSupoja thirdSupoja = new DefaultSupoja(new int[]{3,3,1,1,2,2,4,4,5,5}, 3);

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < answers.length; i++){
            firstSupoja.isCollect(answers[i]);
            secondSupoja.isCollect(answers[i]);
            thirdSupoja.isCollect(answers[i]);

            firstSupoja.checkNextPattern();
            secondSupoja.checkNextPattern();
            thirdSupoja.checkNextPattern();
        }

        if(secondSupoja.collectCount <= firstSupoja.collectCount && thirdSupoja.collectCount <= firstSupoja.collectCount){
            result.add(firstSupoja.id);
        }
        if(firstSupoja.collectCount <= secondSupoja.collectCount && thirdSupoja.collectCount <= secondSupoja.collectCount){
            result.add(secondSupoja.id);
        }
        if(firstSupoja.collectCount <= thirdSupoja.collectCount && secondSupoja.collectCount <= thirdSupoja.collectCount){
            result.add(thirdSupoja.id);
        }

        answer = result.stream().mapToInt(num -> num).toArray();

        return answer;
    }
}

class DefaultSupoja{
    public DefaultSupoja(){}
    public DefaultSupoja(int[] pattern, int id){
        this.pattern = pattern;
        this.id = id;
    }
    int collectCount = 0;
    int nowIndex = 0;
    int[] pattern;
    int id;

    public void isCollect(int num){
        if(pattern[nowIndex] == num){
            collectCount++;
        }
    }

    public void checkNextPattern(){
        if(pattern.length == nowIndex + 1){
            nowIndex = 0;
        }else{
            nowIndex++;
        }
    }
}
