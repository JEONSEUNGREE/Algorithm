// 새로운아이디만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/72410

class Solution {
    public String solution(String new_id) {
        String answer = "";
        boolean isPrevDot = false;
        StringBuilder tmpString = new StringBuilder();

        for(int i = 0; i < new_id.length(); i++){

            // 소문자변환
            char tmpCh = new_id.charAt(i);

            if(65 <= tmpCh && tmpCh <= 90){
                tmpCh = (char)(tmpCh + 32);
            }

            // 소문자,숫자,-,. 외에 문자 제거
            if(!((97 <= tmpCh && tmpCh <= 122) 
               || (48 <= tmpCh && tmpCh <= 57)
               || tmpCh == '-'
               || tmpCh == '_'
               || tmpCh == '.')){
                continue;
            }

            // 마침표 2개이상 연속되는 경우
            if(tmpCh == '.' && !isPrevDot){
                tmpString.append(tmpCh);
                isPrevDot = true;
            }else if(tmpCh == '.' && isPrevDot){
            }else {
                tmpString.append(tmpCh);
                isPrevDot = false;
            }
        }

        // 마침표 처음과 끝 제거
        if(1 <= tmpString.length() && tmpString.charAt(0) == '.'){
            tmpString.delete(0,1);
        }

        if(1 <= tmpString.length() && tmpString.charAt(tmpString.length() - 1) == '.'){
            tmpString.delete(tmpString.length() == 1 ? 0 : tmpString.length() - 1, tmpString.length());
        }

        // 빈문자열 a대입
        if(tmpString.length() == 0){
            tmpString.append("a");
        }

        // 길이가 16이상
        if(16 <= tmpString.length() && tmpString.charAt(14) == '.'){
            tmpString.delete(14, tmpString.length());
        }else if(16 <= tmpString.length()){
            tmpString.delete(15, tmpString.length());
        }

        char lastChar = tmpString.charAt(tmpString.length() - 1);

        //길이 2이하
        while(tmpString.length() <= 2){
            tmpString.append(lastChar);
        }

        answer = tmpString.toString();

        return answer;
    }
}

// 빌드패턴 만든사람 코드

class Solution {
    public String solution(String new_id) {

        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();


        return s;
    }

    private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KAKAOID noStartEndDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }
}
