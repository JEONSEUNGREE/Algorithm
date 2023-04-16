// 바탕화면정리
// https://school.programmers.co.kr/learn/courses/30/lessons/161990
// complete 코드 수정 필요..

public class Java_230416_1 {
    public int[] solution(String[] wallpaper) {

        // 첫번째 열로 초기화
        int startY = 0;
        // 첫번째 열에 #위치로 초기화
        int startX = wallpaper[startY].indexOf("#");
        boolean startFlag = true;

        // 마지막 열로 초기화
        int endY = wallpaper.length - 1;
        // 마지막 열에 #위치로 초기화
        int endX = wallpaper[endY].lastIndexOf("#");

        int[] answer = { startY, startX, endY, endX};

        for(int i = 0; i <= endY; i++){
            int startPos = wallpaper[i].indexOf("#");
            int lastPos = wallpaper[i].lastIndexOf("#");

            // #이 없는경우 바로 반복
            if(startPos < 0){
                continue;
            }

            // START Y 위치 설정
            if(startFlag){
                answer[0] = i;
                startFlag = false;
            }

            // START X 위치 설정
            if(answer[1] > startPos || answer[1] == -1){
                answer[1] = startPos;
            }

            // END X 위치 설정
            if(answer[3] < lastPos){
                answer[3] = lastPos;
            }
            answer[2] = i + 1;
        }

        answer[3] = answer[3] + 1;

        return answer;
    }
}

