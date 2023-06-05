// 시저암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] charArray = s.toCharArray();
        StringBuilder tmpStr = new StringBuilder();
        int lower = 122;
        int upper = 90;

        for(int i = 0; i < charArray.length; i++){
            int std = charArray[i];
            int stdVal = charArray[i] + n;

            if(Character.compare(' ', charArray[i]) == 0){
                tmpStr.append(" ");
                continue;
            }

            if((Character.isLowerCase(std) && stdVal > lower) || (Character.isUpperCase(std) && stdVal > upper)){
                stdVal = stdVal - 26;
            }

            tmpStr.append((char)stdVal);   
        }

