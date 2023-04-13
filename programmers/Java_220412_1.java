//raceGame: https://school.programmers.co.kr/learn/courses/30/lessons/178871 Complete

import java.util.HashMap;

public class Java_220412_1 {

    public static String[] solution(String[] players, String[] callings) {

        String[] answer = new String[players.length];

        HashMap<Integer, String> findString = new HashMap<Integer, String>();
        HashMap<String, Integer> findInt = new HashMap<String, Integer>();

        for (int i = 0; i < players.length; i++) {
            findString.put(i + 1, players[i]);
            findInt.put(players[i], i + 1);
        }

        for (int i = 0; i < callings.length; i++) {
            String call = callings[i];
            String downPlayer = "";

            int upIdx = findInt.get(call);
            downPlayer = findString.get(upIdx - 1);

            findString.put(upIdx - 1, call);
            findString.put(upIdx, downPlayer);

            findInt.put(call, upIdx - 1);
            findInt.put(downPlayer, upIdx);
        }

        int resultIdx = 0;

        for(int key : findString.keySet()){
            answer[resultIdx++] = findString.get(key);
        }

        return answer;
    }
}
