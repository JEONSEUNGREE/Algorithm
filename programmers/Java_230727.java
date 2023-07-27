// 최대공약수최대공배수
// 프로그래머스 1단계

public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int minStd = n < m ? n : m;

        int maxStd = 0;

        for(int i = minStd; i <= minStd; i--){
            if(n % i == 0 && m % i == 0){
                minStd = i;
                break;
            }
        }

        if(minStd == 1){
            maxStd = m * n;
        }else{
            maxStd = minStd * (n / minStd) * (m / minStd);
        }

        answer[0] = minStd;
        answer[1] = maxStd;
        
        return answer;
    }
