package Lv2and3;
import java.util.Stack;
public class 큰수만들기 {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int max;
        int num = number.length() -k;
        int idx = -1;
        for (int i=0; i<num; i++) {
            max = 0;
            for (int j=idx+1; j<=k+i; j++) {
                if (number.charAt(j)-'0' > max) {
                    idx = j;
                    max = number.charAt(j)-'0';
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
    public String solution2(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}
