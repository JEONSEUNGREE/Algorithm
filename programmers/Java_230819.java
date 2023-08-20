// 크레인인형뽑기
// https://school.programmers.co.kr/learn/courses/30/lessons/64061



import java.util.Stack;
import java.util.HashMap;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        HashMap<Integer, String> verticalList = new HashMap<Integer, String> ();
        Stack<Integer> toyList  = new Stack<Integer> ();

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if(0 < board[i][j]){
                    verticalList.put(j + 1, verticalList.getOrDefault(j + 1, "") + String.valueOf(board[i][j]) + ",");
                }
            }
        }

        for(int i = 0; i < moves.length; i++){
            String tmpVal = verticalList.getOrDefault(moves[i], "");
            if(!"".equals(tmpVal)){
                toyList.push(Integer.valueOf(tmpVal.substring(0,tmpVal.indexOf(","))));
                verticalList.put(moves[i], tmpVal.substring(tmpVal.length() == 0 ? 0 : tmpVal.indexOf(",") + 1, tmpVal.length()));

                if(2 <= toyList.size() && toyList.get(toyList.size() - 1) == toyList.get(toyList.size() - 2)){
                    answer += 2;
                    toyList.pop(); toyList.pop();
                }
            }

        }

        return answer;
    }
}

