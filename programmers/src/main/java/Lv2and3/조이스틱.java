package Lv2and3;

public class 조이스틱 {

    public int solution(String name) {
        int answer = 0;
        //abcde fgh ijk l m(12)n o pqr stu vwxyz
        int move = name.length() - 1;

        for (int i = -0; i < name.length(); i++) {
            int c = name.charAt(i) - 'A';
            if (c <= 13) {
                answer += c;
            }
            if (c > 13) {
                answer += 26 - c;
            }
            if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                int end = i + 1;
                while (end < name.length() && name.charAt(end) == 'A') {
                    end++;
                }

                move = Math.min(move, i * 2 + (name.length() - end));
                move = Math.min(move, i + (name.length() - end) * 2);
            }
        }

        return answer + move;
    }
}
