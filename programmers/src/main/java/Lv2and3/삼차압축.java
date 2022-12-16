package Lv2and3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 삼차압축 {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> dic = new HashMap<>();
        char c = 65;
        for (int i = 1; i < 27; i++) {
            dic.put(String.valueOf(c), i);
            c += 1;
        }
        int idx = 27;
        int prev = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<msg.length(); i++) {
            sb.append(msg.charAt(i));
            if (dic.containsKey(sb.toString())) {
                prev = dic.get(sb.toString());
            } else {
                dic.put(sb.toString(), idx++);
                answer.add(prev);
                prev = 0;
                sb.setLength(0);
                i--;
            }
        }
        if (prev != 0) {
            answer.add(prev);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }

}
