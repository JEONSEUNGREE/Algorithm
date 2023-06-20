// 직사각형별그리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder row = new StringBuilder();
        StringBuilder all = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < a; i++){
            row.append("*");
        }

        for(int i = 0; i < b; i++){
            all.append(row).append("\n");
        }


        System.out.print(all.toString());
    }
}

