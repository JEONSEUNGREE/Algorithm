// 햄버거만들기(못품)
// https://school.programmers.co.kr/learn/courses/30/lessons/133502 

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int nowIngredient = 1;
        boolean isReset = false;
        StringBuilder extraIngredient = new StringBuilder();

        for(int i = 0; i < ingredient.length; i++){

            if(isReset){
                
                int differ = ingredient[i] > 1 ? ingredient[i] - 1 : 3;

                if(differ <= extraIngredient.length()){
                    String tmp = extraIngredient.substring(extraIngredient.length() - differ, extraIngredient.length()).toString();

                    switch(tmp){
                        case "123":
                            differ = 3;
                            answer++;
                            break;

                        case "12":
                            differ = 2;
                            nowIngredient = 3;
                            break;

                        case "1":
                            differ = 1;
                            nowIngredient = 2;
                            break;
                    }
                    isReset = false;
                }
            }

            extraIngredient.append(ingredient[i]);

            if(ingredient[i] == 1 && nowIngredient < 4){
                nowIngredient = 1;
            }

            if(nowIngredient == ingredient[i] || nowIngredient == 4){
                nowIngredient++;

                if(nowIngredient == 5 && ingredient[i] == 1){
                    extraIngredient.delete(extraIngredient.length() - 4, extraIngredient.length());
                    nowIngredient = 1;
                    isReset = true;
                    answer++;
                }
            }else{
                nowIngredient = 1;
            }
        }
        
        return answer;
    }
}
