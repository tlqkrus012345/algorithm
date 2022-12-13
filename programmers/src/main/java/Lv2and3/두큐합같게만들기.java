package Lv2and3;
import java.util.*;
public class 두큐합같게만들기 {
    public int solution(int[] queue1, int[] queue2) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0;
        long sum2 = 0;
        for (int a : queue1) {
            sum1 += a;
            q1.add(a);
        }
        for (int a : queue2) {
            sum2 += a;
            q2.add(a);
        }

        int cnt = 0;
        while (sum1 != sum2) {
            cnt++;
            if (sum1 > sum2) {
                int val = q1.poll();
                sum1 -= val;
                sum2 += val;
                q2.offer(val);
            } else {
                int val = q2.poll();
                sum2 -= val;
                sum1 += val;
                q1.offer(val);
            }
            if (cnt > (queue1.length + queue2.length) * 2)
                return -1;
        }
        return cnt;
    }

}
