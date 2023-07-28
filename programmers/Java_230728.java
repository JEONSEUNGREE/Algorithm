// 보물지도
// https://school.programmers.co.kr/learn/courses/30/lessons/17681

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++){
            String tmpA = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i])));
            String tmpB = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i])));
            StringBuilder tmpAns = new StringBuilder();
            for(int j = 0; j < n; j++){
                if("1".equals(String.valueOf(tmpA.charAt(j))) || "1".equals(String.valueOf(tmpB.charAt(j)))){
                    tmpAns.append("#");
                }else{
                    tmpAns.append(" ");
                }
            }
            answer[i] = tmpAns.toString();
        }

        return answer;
    }
}
