package Lv2and3;
import java.util.*;
public class 소수찾기 {
    HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        recursive(numbers, "");
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            if (isPrime(iter.next())) {
                answer++;
            }
        }
        return answer;
    }
    public void recursive(String numbers, String number) {
        if (!number.equals("")) {
            set.add(Integer.valueOf(number));
        }
        for (int i=0; i<numbers.length(); i++) {
            recursive( numbers.substring(0,i) + numbers.substring(i+1) , number + numbers.charAt(i));
        }
    }
    public boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        int limit = (int)Math.sqrt(num);
        for (int i=2; i<=limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}


