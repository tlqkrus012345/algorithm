package Lv2and3;

public class K진수소수구하기 {
    public int solution(int number, int k) {
        int answer = 0;
        for(String s : conversion(number, k).split("0")) {
            if(!s.equals("") && isPrime(Long.parseLong(s))) {
                answer++;
            }
        }
        return answer;
    }

    public String conversion(int num, int n) {
        StringBuilder sb = new StringBuilder();
        int current = num;
        while(current > 0) {
            if(current % n < 10) {
                sb.append(current % n);
            }else {
                sb.append((char)(current % 10 - 10 + 'A'));
            }
            current /= n;
        }
        return sb.reverse().toString();
    }

    public boolean isPrime(long lo) {
        if (lo == 1 || lo == 0) {
            return false;
        }
        int limit = (int) (Math.sqrt(lo));
        for (int i = 2; i <= limit; i++) {
            if (lo % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        K진수소수구하기 ps = new K진수소수구하기();
        System.out.println(ps.solution(4030, 2));
    }
}
