// 공원산책 특정케이스실패 pending
// https://school.programmers.co.kr/learn/courses/30/lessons/172928


import java.util.stream.Stream;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};

        String[] row = new String[park.length];
        String[] col = new String[park[0].length()];

        int[] startPos = {0,0};
        answer = startPos;

        // x축 확인
        for(int i = 0; i < park.length; i++){
            row[i] = "";
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'X'){
                    row[i] += j;
                }else if(park[i].charAt(j) == 'S'){
                    startPos[0] = i;
                    startPos[1] = j;
                }
            }
        }

        // y축확인
        for(int i = 0; i < park[0].length(); i++){
            col[i] = "";
            for(int j = 0; j < park.length; j++){
                if(park[j].charAt(i) == 'X'){
                    col[i] += j;
                }
            }
        }

        for(int i = 0; i < routes.length; i++){
            answer = move(routes[i], park, answer, row, col);
        }

        return answer;
    }

    public static int[] move(String route, String[] park, int[] curPos, String[] row, String[] col){

        String direction = route.split(" ")[0];
        int range = Integer.valueOf(route.split(" ")[1]);
        int x = curPos[1];
        int y = curPos[0];

        switch(direction){

            case "E":

                if(x + range < park[y].length() && !IntStream.rangeClosed(x, x + range).anyMatch(num -> row[y].contains(String.valueOf(num))))
                {
                    curPos[1] = x + range;
                }
                
                break;
                
            case "W":

                if(x - range >= 0 && !IntStream.rangeClosed(x - range, x).anyMatch(num -> row[y].contains(String.valueOf(x - num))))
                {
                    curPos[1] = x - range;
                }
                
                break;

            case "S":

                if(y + range < park.length && !IntStream.rangeClosed(y, y + range).anyMatch(num -> col[x].contains(String.valueOf(num))))
                {
                    curPos[0] = y + range;
                }
                
                break;

            case "N":

                if(y - range >= 0 && !IntStream.rangeClosed(y - range, y).anyMatch(num -> col[x].contains(String.valueOf(y - num))))
                {
                    curPos[0] = y - range;
                }
                
                break;
        }

        return curPos;
    }
}
